package practice.ratelimiter;

public class TokenBucket {
    private final long maxBucketSize;
    private final long tokenRefillRate;

    private double currentBucketSize;
    private long lastRefillTimeStamp;

    TokenBucket(long size,long rate){
        maxBucketSize = size;
        tokenRefillRate = rate;
        currentBucketSize = maxBucketSize;
        lastRefillTimeStamp = System.currentTimeMillis();
    }

    public synchronized boolean allowRequest(int token){
        refill();
        if(currentBucketSize > token){
            currentBucketSize = currentBucketSize - token;
            return true;
        }
        return false;
    }

    public void refill(){
        long currentTime = System.currentTimeMillis();
        double tokenToAdd = (double) ((currentTime - lastRefillTimeStamp) * tokenRefillRate) /(1000);
        currentBucketSize = Math.min(currentBucketSize+ tokenToAdd,maxBucketSize);
        lastRefillTimeStamp = currentTime;
    }
}

package practice.ratelimiter;

public class Client {
    public static void main(String[] args) throws InterruptedException{
        TokenBucket tokenBucket = new TokenBucket(10,5);
        int totalRequest = 30;
        long requestIntervalInMilis = 200;
        for(int i =1; i <= totalRequest; i++){
            boolean allowed = tokenBucket.allowRequest(5);
            if(allowed){
                System.out.println("Request Allowed for "+i);
            }else{
                System.out.println("Request Denied  for "+i);
            }
            Thread.sleep(requestIntervalInMilis);
        }
    }
}

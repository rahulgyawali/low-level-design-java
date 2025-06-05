package practice.chainofresponsbility.logger;

public abstract class LogProcessor {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    LogProcessor logProcessor;

    LogProcessor(LogProcessor logProcessor){
        this.logProcessor = logProcessor;
    }

    public void log(int logLevel,String message){
        if(logProcessor != null){
            logProcessor.log(logLevel,message);
        }
    }
}

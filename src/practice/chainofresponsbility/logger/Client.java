package practice.chainofresponsbility.logger;

public class Client {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoProcessor(new DebugProcessor(new ErrorProcessor(null)));
        logProcessor.log(1,"Debugging Pointer");
        logProcessor.log(2,"NUll Pointer");
        logProcessor.log(3,"helper");
    }

}

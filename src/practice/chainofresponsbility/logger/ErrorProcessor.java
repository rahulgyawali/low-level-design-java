package practice.chainofresponsbility.logger;

public class ErrorProcessor extends LogProcessor{
    ErrorProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(ERROR == logLevel){
            System.out.println("ERROR: "+message);
            return;
        }
        super.log(logLevel, message);
    }
}

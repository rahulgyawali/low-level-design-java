package practice.chainofresponsbility.logger;

public class DebugProcessor extends LogProcessor{
    DebugProcessor(LogProcessor processor){
        super(processor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(DEBUG == logLevel){
            System.out.println("DEBUG: "+message);
            return;
        }
        super.log(logLevel, message);
    }
}

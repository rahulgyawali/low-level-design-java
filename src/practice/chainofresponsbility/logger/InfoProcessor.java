package practice.chainofresponsbility.logger;

public class InfoProcessor extends LogProcessor{
    InfoProcessor(LogProcessor logProcessor){
        super(logProcessor);
    }
    public void log(int logLevel,String message){
        if(INFO == logLevel){
            System.out.println("INFO: "+message);
        }else{
            super.log(logLevel,message);
        }

    }
}

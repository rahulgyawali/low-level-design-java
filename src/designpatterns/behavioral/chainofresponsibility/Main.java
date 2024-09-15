package designpatterns.behavioral.chainofresponsibility;

public class Main {

    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
        logProcessor.log(logProcessor.ERROR,"Error Happened");
        logProcessor.log(logProcessor.DEBUG,"Need to debug");
        logProcessor.log(logProcessor.INFO,"Just info");
    }
}

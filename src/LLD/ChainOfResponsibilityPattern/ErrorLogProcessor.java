package LLD.ChainOfResponsibilityPattern;

public class ErrorLogProcessor extends LogProcessor{

    public ErrorLogProcessor(LogProcessor nexLogProcessor) {
        super(nexLogProcessor);
    }
    public void log(int logLevel, String message) {
        if(logLevel == 3)
            System.out.println("ERROR" + message);
        else
            super.log(logLevel, message);
    }
}

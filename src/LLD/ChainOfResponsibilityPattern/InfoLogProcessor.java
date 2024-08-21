package LLD.ChainOfResponsibilityPattern;

public class InfoLogProcessor extends LogProcessor{

    public InfoLogProcessor(LogProcessor nexLogProcessor) {
        super(nexLogProcessor);
    }
    public void log(int logLevel, String message) {
        if(logLevel == 1)
            System.out.println("INFO" + message);
        else
            super.log(logLevel, message);
    }
}

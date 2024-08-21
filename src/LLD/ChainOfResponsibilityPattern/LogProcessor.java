package LLD.ChainOfResponsibilityPattern;

public abstract class LogProcessor {
    public static int info = 1;
    public static int debug = 2;
    public static int error = 3;
    LogProcessor nextLogProcessor;
    public LogProcessor(LogProcessor logProcessor) {
        this.nextLogProcessor = logProcessor;
    }
    public void log(int logLevel, String message) {
        if(nextLogProcessor != null)
            nextLogProcessor.log(logLevel, message);
    }
}

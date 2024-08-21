package LLD.ChainOfResponsibilityPattern;

public class Main {
    public static void main(String[] args){
      LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));
      logProcessor.log(3, " Error Occurred");
      logProcessor.log(1, " Just Info");
      logProcessor.log(2, " Just Debug");
    }
}

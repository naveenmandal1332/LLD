public class InfoProcessor extends LogProcessor {

  public InfoProcessor(LogProcessor nextLogProcessor) {
    super(nextLogProcessor);
  }

  public void log(ErrorType logLevel, String message) {
    if (logLevel == ErrorType.INFO) {
      System.out.println("INFO : " + message);
    } else {
      super.log(logLevel, message);
    }
  }
}
public class ErrorProcessor extends LogProcessor {

  public ErrorProcessor(LogProcessor nextLogProcessor) {
    super(nextLogProcessor);
  }

  public void log(ErrorType logLevel, String message) {
    if (logLevel == ErrorType.ERROR) {
      System.out.println("ERROR : " + message);
    } else {
      super.log(logLevel, message);
    }
  }
}
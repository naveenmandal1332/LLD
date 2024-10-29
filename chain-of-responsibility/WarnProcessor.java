public class WarnProcessor extends LogProcessor {

  public WarnProcessor(LogProcessor nextLogProcessor) {
    super(nextLogProcessor);
  }

  @Override
  public void log(ErrorType logLevel, String message) {
    if (logLevel == ErrorType.WARN) {
      System.out.println("WARN : " + message);
    } else {
      super.log(logLevel, message);
    }
  }

}
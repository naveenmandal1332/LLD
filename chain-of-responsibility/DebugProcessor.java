public class DebugProcessor extends LogProcessor {

  public DebugProcessor(LogProcessor nextLogProcessor) {
    super(nextLogProcessor);
  }

  public void log(ErrorType logLevel, String message) {
    if (logLevel == ErrorType.DEBUG) {
      System.out.println("DEBUG : " + message);
    } else {
      super.log(logLevel, message);
    }
  }
}
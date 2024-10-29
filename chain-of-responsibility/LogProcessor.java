/**
 * LogProcessor
 */
public abstract class LogProcessor {

  LogProcessor nextLogProcessor;

  LogProcessor(LogProcessor logProcessor) {
    this.nextLogProcessor = logProcessor;
  }

  public void log(ErrorType logLevel, String message) {
    if (nextLogProcessor != null) {
      nextLogProcessor.log(logLevel, message);
    }
  }
}
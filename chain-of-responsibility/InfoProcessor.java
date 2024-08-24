public class InfoProcessor extends LogProcessor {

  InfoProcessor(LogProcessor nextLogProcessor) {
    super(nextLogProcessor);
  }

  public void log(int logLevel, String message) {
    if (logLevel == INFO) {
      System.out.println("INFO : " + message);
    } else {
      super.log(logLevel, message);
    }
  }
}
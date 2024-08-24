public class Client {

  public static void main(String[] args) {

    LogProcessor logger = new InfoProcessor(new DebugProcessor(new ErrorProcessor(null)));

    logger.log(LogProcessor.ERROR, "I got error!");
    logger.log(LogProcessor.DEBUG, "I got debug!");
    logger.log(0, "I got nothing!");

  }
}
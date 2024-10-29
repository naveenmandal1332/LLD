public class Client {

  public static void main(String[] args) {

    LogProcessor logger = new InfoProcessor(new WarnProcessor(new DebugProcessor(new ErrorProcessor(null))));

    logger.log(ErrorType.ERROR, "I got error!");
    logger.log(ErrorType.DEBUG, "I got debug!");
    logger.log(ErrorType.WARN, "I got Warning!");
    logger.log(null, "I got nothing!");

  }
}
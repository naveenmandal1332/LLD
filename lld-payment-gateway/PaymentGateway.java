import Instrument.Instrument;
import Instrument.InstrumentController;
import Instrument.InstrumentDO;
import Instrument.InstrumentType;
import Transaction.TransactionController;
import Transaction.TransactionDTO;
import User.User;
import User.UserController;

public class PaymentGateway {

  public static void main(String[] args) {
    InstrumentController instrumentController = new InstrumentController();
    UserController userController = new UserController();
    TransactionController transactionController = new TransactionController();

    // Add Users:
    User userOne = userController.addUser("Naveen Mandal", "email@123.gmail.com");
    User userTwo = userController.addUser("Vikash Mandal", "email@1234.gmail.com");
    User userThree = userController.addUser("Vijay Mandal", "email@124.gmail.com");

    // Display All User:

    // Add Instrument To User:
    InstrumentDO bank1 = new InstrumentDO();
    bank1.setAccountNumber("123456734565656");
    bank1.setIfscCode("SBI000123");
    bank1.setUserId(userOne.getUserId());
    bank1.setInstrumentType(InstrumentType.BANK);

    InstrumentDO bank2 = new InstrumentDO();
    bank2.setAccountNumber("987654321064656");
    bank2.setIfscCode("SBI006123");
    bank2.setUserId(userTwo.getUserId());
    bank2.setInstrumentType(InstrumentType.BANK);

    InstrumentDO card1 = new InstrumentDO();
    card1.setCardNumber("1212324244353535545");
    card1.setCvvNumber("987");
    bank2.setUserId(userOne.getUserId());
    bank2.setInstrumentType(InstrumentType.CARD);

    InstrumentDO card2 = new InstrumentDO();
    card2.setCardNumber("121898983535545");
    card2.setCvvNumber("979");
    card2.setUserId(userThree.getUserId());
    card2.setInstrumentType(InstrumentType.CARD);

    InstrumentDO card3 = new InstrumentDO();
    card3.setCardNumber("87867686868688978");
    card3.setCvvNumber("900");
    card3.setUserId(userThree.getUserId());
    card3.setInstrumentType(InstrumentType.CARD);

    // Instrument inst1 = instrumentController.addInstrument(bank1);
    // Instrument inst2 = instrumentController.addInstrument(bank2);
    Instrument inst3 = instrumentController.addInstrument(card1);
    // Instrument inst4 = instrumentController.addInstrument(card2);
    // Instrument inst5 = instrumentController.addInstrument(card3);

    // Make Transaction:
    // TransactionDTO t1 = new TransactionDTO(userOne.getUserId(),
    // userTwo.getUserId(), inst1.getInstruemntId(), inst2.getInstruemntId(), 1000);

    // transactionController.makePayment(t1);
  }
}
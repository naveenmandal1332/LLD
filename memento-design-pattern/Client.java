public class Client {

  public static void main(String[] args) {

    ConfigurationCareTaker careTaker = new ConfigurationCareTaker();

    // Intialize originator:
    ConfigurationOriginator originator = new ConfigurationOriginator(10, 20);

    // Save 1:
    ConfigurationMemento snapShot1 = originator.createMemento();
    careTaker.addMemento(snapShot1);

    // Change State:
    originator.setHeight(15);

    // Save 2:
    ConfigurationMemento snapShot2 = originator.createMemento();
    careTaker.addMemento(snapShot2);

    originator.setHeight(40);
    originator.setWidth(40);

    // Undo:
    ConfigurationMemento restoreState = careTaker.undo();
    originator.restoreMemento(restoreState);

    System.out.println("Height: " + originator.height + " | " + "Widht: " + originator.width);
  }
}
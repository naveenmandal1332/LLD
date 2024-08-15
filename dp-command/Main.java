import command.SetTempCommand;
import command.TurnOffCommand;
import command.TurnOnCommand;
import invoker.MyRemoteControl;
import receiver.AirConditioner;

public class Main {

  public static void main(String[] args) {

    // AC Object:
    AirConditioner ac = new AirConditioner();

    // Remote Control object:
    MyRemoteControl remote = new MyRemoteControl();

    // Set Command:
    remote.setCommand(new TurnOnCommand(ac));

    // Press Button:
    remote.pressButton();

    // Undo:
    remote.undo();
  }
}
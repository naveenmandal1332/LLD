package command;

import receiver.AirConditioner;

public class TurnOnCommand implements ICommand {
  AirConditioner ac;

  public TurnOnCommand(AirConditioner ac) {
    this.ac = ac;
  }

  @Override
  public void execute() {
    ac.turnOnAc();
  }

  @Override
  public void undo() {
    ac.turnOffAc();
    System.out.println("Undo your command");
  }
}
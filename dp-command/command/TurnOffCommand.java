package command;

import receiver.AirConditioner;

public class TurnOffCommand implements ICommand {

  AirConditioner ac;

  public TurnOffCommand(AirConditioner ac) {
    this.ac = ac;
  }

  @Override
  public void execute() {
    ac.turnOffAc();
  }

  @Override
  public void undo() {
    ac.turnOnAc();
  }
}
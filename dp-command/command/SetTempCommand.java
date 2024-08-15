package command;

import receiver.AirConditioner;

public class SetTempCommand implements ICommand {

  AirConditioner ac;
  int temp;

  public SetTempCommand(AirConditioner ac, int temp) {
    this.ac = ac;
    this.temp = temp;
  }

  @Override
  public void execute() {
    ac.setTemperature(temp);
  }

  @Override
  public void undo() {
    ac.setTemperature(temp);
    System.out.println("New Temp is " + temp);
  }
}
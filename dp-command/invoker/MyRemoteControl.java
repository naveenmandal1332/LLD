package invoker;

import java.util.Stack;

import command.ICommand;

public class MyRemoteControl {
  ICommand command;
  Stack<ICommand> allCommand = new Stack<>();

  public void setCommand(ICommand command) {
    this.command = command;
  }

  public void pressButton() {
    command.execute();
  }

  public void undo() {
    if (!allCommand.isEmpty()) {
      ICommand lastCommand = allCommand.pop();
      lastCommand.undo();
    }
  }
}

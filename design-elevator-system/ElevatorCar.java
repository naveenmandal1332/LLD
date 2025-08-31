public class ElevatorCar {

  int id;
  Display display;
  InternalButton internalButton;
  ElevatorState elevatorState;
  int currentFloor;
  Direction elevatorDirection;
  ElevatorDoor elevatorDoor;

  public ElevatorCar() {
    display = new Display();
    internalButton = new InternalButton();
    elevatorState = ElevatorState.IDLE;
    currentFloor = 0;
    elevatorDirection = Direction.UP;
    elevatorDoor = new ElevatorDoor();
  }

  public int getCurrentFloor() {
    return currentFloor;
  }

  public void showDisplay() {
    display.showDisplay();
  }

  public void pressButton(int destination) {

  }
}
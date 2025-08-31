public class Display {

  int floor;
  Direction direction;

  public int getFloor() {
    return floor;
  }

  public void setFloor(int floor) {
    this.floor = floor;
  }

  public Direction getDirection() {
    return direction;
  }

  public void setDirection(Direction direction) {
    this.direction = direction;
  }

  public void showDisplay() {
    System.out.println("Floor: " + floor);
    System.out.println("Direction: " + direction);

  }

}
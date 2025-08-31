import java.util.Collections;
import java.util.LinkedList;
import java.util.PriorityQueue;
import java.util.Queue;

public class ElevatorController {

  ElevatorCar elevatorCar;
  PriorityQueue<Integer> upMinQ;
  PriorityQueue<Integer> downMaxQ;
  Queue<Integer> pendingRequest;

  ElevatorController() {
    elevatorCar = new ElevatorCar();
    upMinQ = new PriorityQueue<>();
    downMaxQ = new PriorityQueue<>(Collections.reverseOrder());
    pendingRequest = new LinkedList<>();
  }

  public void submitExternalRequest(int floor, Direction direction) {
    if (direction == Direction.DOWN) {
      downMaxQ.add(floor);

      if (floor > elevatorCar.getCurrentFloor()) {
        pendingRequest.add(floor);
      }

    } else {
      upMinQ.add(floor);

      if (floor < elevatorCar.getCurrentFloor()) {
        pendingRequest.add(floor);
      }
    }
  }

  public void submitInternalRequest(int floor) {

  }

  public void controlElevator() {
    while (true) {

      if (elevatorCar.elevatorDirection == Direction.UP) {

      }
    }
  }

}
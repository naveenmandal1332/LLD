import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Flight {

  private String flightNumber;
  private String airline;
  private String from;
  private String to;

  private int departDate;
  private double departTime;
  Map<String, FareType> fareTypes;

  public Flight(
      String flightNumber,
      String airline,
      String from,
      String to,
      int departDate,
      double departTime) {

    this.flightNumber = flightNumber;
    this.airline = airline;
    this.from = from;
    this.to = to;
    this.departDate = departDate;
    this.departTime = departTime;
    this.fareTypes = new HashMap<>();
  }

  public int getDepartDate() {
    return departDate;
  }

  public void addFareType(String fareType, double price, List<String> seats) {
    FareType fare = new FareType(fareType, price, new HashSet<>(seats));
    fareTypes.put(fareType, fare);
  }

  public List<FareType> getAvailableFareTypeByPaxCount(int paxCount) {
    return fareTypes.values().stream().filter(
        fareType -> fareType.getAvailableSeats().size() >= paxCount).collect(Collectors.toList());
  }

  public FareType getFareType(String fareType) {
    return fareTypes.get(fareType);
  }

  @Override
  public String toString() {
    return String.format("<%s, %s, %s, %s, %d, %.2f>", flightNumber, airline, from, to, departDate, departTime);
  }
}
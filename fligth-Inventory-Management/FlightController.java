import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FlightController {
  Map<String, Flight> flights;

  public FlightController() {
    flights = new HashMap<>();
  }

  public void addFlight(Flight flight) {
    flights.put(flight.toString(), flight);
  }

  public List<Flight> searchFlightFrom(String from, String to, int departDate, int paxCount) {
    List<Flight> availableFlights = flights.values().stream().filter(
        flight -> flight.toString().contains(from) && flight.toString().contains(to)
            && flight.getDepartDate() == departDate && flight.getAvailableFareTypeByPaxCount(paxCount).size() > 0)
        .collect(Collectors.toList());

    return availableFlights;
  }

  public List<Flight> searchFlight(String from, String to, int departDate, int paxCount, String preferredAirline,
      String sortBy, String sortType) {

    List<Flight> availableFlights = flights.values().stream().filter(
        flight -> flight.toString().contains(from)
            && flight.toString().contains(to)
            && flight.getDepartDate() == departDate
            && flight.getAvailableFareTypeByPaxCount(paxCount).size() > 0
            && flight.toString().contains(preferredAirline))
        .collect(Collectors.toList());

    if (sortBy.equals("Economy")) {
      availableFlights = availableFlights.stream()
          .filter(f -> f.getFareType(sortBy).equals("Economy"))
          .collect(Collectors.toList());
    }

    if (sortBy.equals("Business")) {
      availableFlights = availableFlights.stream()
          .filter(f -> f.getFareType(sortBy).equals("Business"))
          .collect(Collectors.toList());
    }

    return availableFlights;
  }
}
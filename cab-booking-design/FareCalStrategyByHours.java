
public class FareCalStrategyByHours implements FareCalStrategy {
  @Override
  public double calculateFare(double distance, int hours) {
    return hours * 20;
  }

}
public class FareCalStrategyByDistance implements FareCalStrategy {

  @Override
  public double calculateFare(double distance, int hours) {
    return distance * 10;
  }

}
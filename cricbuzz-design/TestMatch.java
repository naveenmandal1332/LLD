public class TestMatch implements MatchType {

  @Override
  public int numberOfOvers() {
    return 100;
  }

  @Override
  public int maxOverCountForBowler() {
    return 25;
  }
}
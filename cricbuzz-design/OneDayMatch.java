public class OneDayMatch implements MatchType {

  @Override
  public int numberOfOvers() {
    return 50;
  }

  @Override
  public int maxOverCountForBowler() {
    return 10;
  }
}
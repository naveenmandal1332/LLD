public class TTwentyMatch implements MatchType {

  @Override
  public int numberOfOvers() {
    return 20;
  }

  @Override
  public int maxOverCountForBowler() {
    return 4;
  }
}
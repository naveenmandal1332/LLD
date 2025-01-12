package Player;

import java.util.Deque;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class PlayerBowlingController {

  Deque<Player> totalBowler;
  Map<Player, Integer> bowlerOverCount;
  Player currentBowler;

  public PlayerBowlingController(List<Player> bowlerList) {
    this.totalBowler = new LinkedList<>();
    this.bowlerOverCount = new HashMap<>();
    setBowler(bowlerList);
  }

  public void setBowler(List<Player> bowlerList) {
    for (Player bowler : bowlerList) {
      this.totalBowler.addLast(bowler);
      this.bowlerOverCount.put(bowler, 0);
    }
  }

  public void getNextBowler() {

  }

  public Player getCurrentBowler() {
    return currentBowler;
  }

}
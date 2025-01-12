package Player;

import java.util.LinkedList;
import java.util.Queue;

public class PlayerBattingController {
  Queue<Player> yetToPlay;
  Player striker;
  Player nonStriker;

  public PlayerBattingController(Queue<Player> playing11) {
    this.yetToPlay = new LinkedList<>();
    this.yetToPlay.addAll(playing11);
  }

  public void getNextPlayer() throws Exception {
    if (yetToPlay.isEmpty())
      throw new Exception("All Out!");

    if (striker == null)
      striker = yetToPlay.poll();

    if (nonStriker == null)
      nonStriker = yetToPlay.poll();
  }

  public Player getStriker() {
    return striker;
  }

  public void setStriker(Player striker) {
    this.striker = striker;
  }

  public Player getNonStriker() {
    return nonStriker;
  }

  public void setNonStriker(Player nonStriker) {
    this.nonStriker = nonStriker;
  }

}
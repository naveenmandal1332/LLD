package Team;

import java.util.List;
import java.util.Queue;

import Player.Player;
import Player.PlayerBattingController;
import Player.PlayerBowlingController;

public class Team {
  String teamName;
  Queue<Player> palyingEleven;
  List<Player> bench;
  PlayerBattingController playerBattingController;
  PlayerBowlingController playerBowlingController;
  boolean isWinner;

  public Team(String teamName, Queue<Player> palyingEleven, List<Player> bench,
      PlayerBattingController playerBattingController, PlayerBowlingController playerBowlingController) {
    this.teamName = teamName;
    this.palyingEleven = palyingEleven;
    this.bench = bench;
    this.playerBattingController = playerBattingController;
    this.playerBowlingController = playerBowlingController;
  }

  public void chooseNextBatsMan() throws Exception {
    playerBattingController.getNextPlayer();
  }

  public void chooseNextBowler() {
    playerBowlingController.getNextBowler();
  }

  public void getCurrentBowler() {
    playerBowlingController.getCurrentBowler();
  }

  public void getStriker() {
    playerBattingController.getStriker();
  }

  public void setStriker(Player player) {
    playerBattingController.setStriker(player);
  }

  public void getNonStriker() {
    playerBattingController.getNonStriker();
  }

  public void setNonStriker(Player player) {
    playerBattingController.setNonStriker(player);
  }

  public void printBattingScoreCard() {
  }

  public void printBowlingScoreCard() {
  }

  public int getTotalRuns() {
    return 0;
  }

  public String getTeamName() {
    return teamName;
  }

  public Queue<Player> getPalyingEleven() {
    return palyingEleven;
  }

  public List<Player> getBench() {
    return bench;
  }
}
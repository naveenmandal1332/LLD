import java.util.concurrent.ThreadLocalRandom;

public class Board {

  Cell[][] cells;

  Board(int boardSize, int numberOfSnake, int numberOfLadder) {
    initializeBoard(boardSize);
    addSnakesAndLadder(cells, numberOfSnake, numberOfLadder);
  }

  private void initializeBoard(int boardSize) {
    cells = new Cell[boardSize][boardSize];

    for (int i = 0; i < boardSize; i++) {
      for (int j = 0; j < boardSize; j++) {
        Cell obj = new Cell();
        cells[i][j] = obj;
      }
    }
  }

  private void addSnakesAndLadder(Cell[][] cells, int numberOfSnake, int numberOfLadder) {

    // For Snake:
    while (numberOfSnake > 0) {
      int snakeHead = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
      int snakeTail = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);

      if (snakeTail >= snakeHead) {
        continue;
      }

      Jump snakeObj = new Jump();
      snakeObj.start = snakeHead;
      snakeObj.end = snakeTail;

      Cell cell = getCell(snakeHead);
      cell.jump = snakeObj;

      numberOfSnake--;
    }

    // For Ladder:
    while (numberOfLadder > 0) {
      int LadderStart = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);
      int LadderEnd = ThreadLocalRandom.current().nextInt(1, cells.length * cells.length - 1);

      if (LadderStart >= LadderEnd) {
        continue;
      }

      Jump snakeObj = new Jump();
      snakeObj.start = LadderStart;
      snakeObj.end = LadderEnd;

      Cell cell = getCell(LadderStart);
      cell.jump = snakeObj;

      numberOfLadder--;
    }

  }

  public Cell getCell(int position) {
    int size = cells.length;
    int row = (position / size);
    int col = (position % size);

    return cells[row][col];
  }

}
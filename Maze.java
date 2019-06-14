public class Maze {

  public static final int N = 2; // change name later
  // fields
  String[][] maze;
  int[] lastVisited, currentTile;

  // constructors

  // change later
  public Maze(String[][] inputMaze, int[] start) {
    currentTile = new int[N];
    for (int i = 0; i < N; i++) currentTile[i] = start[i];

    maze = new String[inputMaze.length][inputMaze.length];
    for (int row = 0; row < inputMaze.length; row++) {
      for (int col = 0; col < inputMaze.length; col++) {
        maze[row][col] = inputMaze[row][col];
      }
    }
    maze[currentTile[0]][currentTile[1]] = "o";
  }

  public Maze(Maze old) {
    // copy constructor, use later
  }

  // methods

  public boolean accept() {
    return false;
  }

  public boolean lastIsNoGood() {
    return true;
  }

  public void move(int x, int y) { // must be between -1 and 1 (inclusive)
    maze[currentTile[0]][currentTile[1]] = "*";
    currentTile[0] += x;
    currentTile[1] += y;
    maze[currentTile[0]][currentTile[1]] = "o";
  }

  public void undo() {

  }

  public String toString() { // display 'o' in here, not in actual String[][]
    String output = "Maze size: " + maze.length + "x" + maze.length;
    output += System.lineSeparator() + "   ";

    for (int i = 0; i < maze.length; i++) {
      output += "_ ";
    }

    output += System.lineSeparator();

    for (int row = 0; row < maze.length; row++) {
      output += System.lineSeparator() + "|  ";
      for (int col = 0; col < maze.length; col++) {
        output += maze[row][col] + " ";
      }
      output += " |";
    }

    output += System.lineSeparator() + "   ";

    for (int i = 0; i < maze.length; i++) {
      output += "_ ";
    }

    return output;
  }
}

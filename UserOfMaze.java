public class UserOfMaze {
  public static void main(String[] args) {

    String[][] inputMaze = {
                              {" ", "*", " "},
                              {"*", "*", "*"},
                              {" ", "*", " "},
                           };

    int[] currentTile = {1, 1};


     Maze maze = new Maze(inputMaze, currentTile);
     System.out.println(maze);

     maze.move(0, 1);

     System.out.println(maze);
  }
}

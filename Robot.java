import java.util.Scanner;

class Main {
  
  public static String r = "R";

  // (y, x)
  public static int[] rPos = {1, 2};

  // Make gird
  public static String[][] grid = {
      {"#", "#", "#", "#", "#"},
      {"#", " ", " ", " ", "#"},
      {"#", " ", " ", " ", "#"},
      {"#", " ", " ", " ", "#"},
      {"#", "#", "#", "#", "#"}
  };
  
  public static void main(String[] args) {

    Scanner sc = new Scanner(System.in);
    String direction = null;

    while(true) {
      clearScreen();
      drawGrid();
      // Gets move input
      direction = sc.nextLine();
      // Moves
      moveRobot(direction);
    }
    
  }
  
  public static void clearScreen() {  
    System.out.print("\033[H\033[2J");  
    System.out.flush();  
  } 

  // Draws
  public static void drawGrid() {

    
    
    // Robot
    grid[rPos[0]][rPos[1]] = r;
    
    // Draw
    for (int i = 0; i < grid.length; i++) {
      for (int j = 0; j < grid[i].length; j++) {
        System.out.print(grid[i][j]);
      }
      System.out.println();
    }
  }

  // Moves
  public static void moveRobot(String direction) {
    
    switch(direction) {
      case "left":
        if (grid[rPos[0]][rPos[1] - 1] != "#") {
          grid[rPos[0]][rPos[1]] = " ";
          rPos[1] -= 1;
        }
        break;
      case "right":
        if (grid[rPos[0]][rPos[1] + 1] != "#") {
          grid[rPos[0]][rPos[1]] = " ";
          rPos[1] += 1;
        }
        break;
      case "down":
        if (grid[rPos[0] + 1][rPos[1]] != "#") {
          grid[rPos[0]][rPos[1]] = " ";
          rPos[0] += 1;
        }
        break;
      case "up":
        if (grid[rPos[0] - 1][rPos[1]] != "#") {
          grid[rPos[0]][rPos[1]] = " ";
          rPos[0] -= 1;
        }
        break;
      default:
        break;
    }
  }

  
}


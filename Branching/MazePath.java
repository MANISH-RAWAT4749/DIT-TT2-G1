public class MazePath {
    public static void main(String[] args) {
        int[][] maze = {
            {1, 0, 1, 1, 1},
            {1, 1, 1, 0, 1},
            {0, 0, 1, 1, 1},
            {0, 0, 1, 0, 1},
            {0, 0, 1, 1, 1}
        };

        int rows = maze.length;
        int columns = maze[0].length;

        boolean[][] visited = new boolean[rows][columns];

        if (solveMaze(maze, 0, 0, visited)) {
            System.out.println("Path exists in the maze.");
        } else {
            System.out.println("No path exists in the maze.");
        }
    }

    private static boolean solveMaze(int[][] maze, int row, int col, boolean[][] visited) {
        int rows = maze.length;
        int columns = maze[0].length;

        // Check if current position is a valid cell
        if (row < 0 || row >= rows || col < 0 || col >= columns || maze[row][col] == 0 || visited[row][col]) {
            return false;
        }

        // Mark current cell as visited
        visited[row][col] = true;

        // Check if we reached the destination (bottom-right cell)
        if (row == rows - 1 && col == columns - 1) {
            return true;
        }

        // Recursively explore all possible paths from the current cell
        if (solveMaze(maze, row + 1, col, visited)) { // Move down
            return true;
        }
        if (solveMaze(maze, row, col + 1, visited)) { // Move right
            return true;
        }
        if (solveMaze(maze, row - 1, col, visited)) { // Move up
            return true;
        }
        if (solveMaze(maze, row, col - 1, visited)) { // Move left
            return true;
        }

        // If no paths lead to the destination, backtrack by marking the current cell as unvisited
        visited[row][col] = false;

        return false;
    }
}

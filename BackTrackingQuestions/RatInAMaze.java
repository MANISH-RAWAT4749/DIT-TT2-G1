
import java.util.ArrayList;
import java.util.List;

public class RatInAMaze {
    public static List<String> findPath(int[][] maze) {
    List<String> path = new ArrayList<>();
    findPathHelper(maze, 0, 0, maze.length, maze[0].length, path);
    return path;
}

private static boolean findPathHelper(int[][] maze, int row, int col, int numRows, int numCols, List<String> path) {
    if (row < 0 || col < 0 || row >= numRows || col >= numCols || maze[row][col] == 0) {
        return false;
    }

    if (row == numRows - 1 && col == numCols - 1) {
        path.add("(" + row + ", " + col + ")");
        return true;
    }

    if (findPathHelper(maze, row + 1, col, numRows, numCols, path) ||
        findPathHelper(maze, row, col + 1, numRows, numCols, path) ||
        findPathHelper(maze, row - 1, col, numRows, numCols, path) ||
        findPathHelper(maze, row, col - 1, numRows, numCols, path)) {
        path.add("(" + row + ", " + col + ")");
        return true;
    }

    return false;
}


    public static void main(String[] args) {
        int[][] maze = {
            { 1, 0, 0, 0 },
            { 1, 1, 0, 1 },
            { 0, 1, 0, 0 },
            { 1, 1, 1, 1 }
        };

        List<String> path = findPath(maze);
        System.out.println("Path: " + path);
    }
}

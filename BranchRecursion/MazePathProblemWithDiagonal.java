import java.util.ArrayList;
import java.util.List;

public class MazePathProblemWithDiagonal {

    public static void mazePathProblem(int row, int col, int endRow, int endCol, String result) {
        if (row == endRow && col == endCol) {
            System.out.println(result);
        } else {
            if (row < endRow) {
                mazePathProblem(row + 1, col, endRow, endCol, result + "D");
            }
            if (col < endCol) {
                mazePathProblem(row, col + 1, endRow, endCol, result + "R");
            }
            if (row < endRow && col < endCol) {
                mazePathProblem(row + 1, col + 1, endRow, endCol, result + "D");
            }
        }
    }

    public static void main(String[] args) {
        mazePathProblem(0, 0, 2, 2, "");
    }
}

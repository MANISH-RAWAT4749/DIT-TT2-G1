import java.util.HashSet;
import java.util.Set;

public class Sudoku{
  public static void main(String[] args) {
        char[][] board = {
            { '5', '3', '.', '.', '7', '.', '.', '.', '.' },
            { '6', '.', '.', '1', '9', '5', '.', '.', '.' },
            { '.', '9', '8', '.', '.', '.', '.', '6', '.' },
            { '8', '.', '.', '.', '6', '.', '.', '.', '3' },
            { '4', '.', '.', '8', '.', '3', '.', '.', '1' },
            { '7', '.', '.', '.', '2', '.', '.', '.', '6' },
            { '.', '6', '.', '.', '.', '.', '2', '8', '.' },
            { '.', '.', '.', '4', '1', '9', '.', '.', '5' },
            { '.', '.', '.', '.', '8', '.', '.', '7', '9' }
        };

        boolean isValid = isValidSudoku(board);
        System.out.println("Is Valid Sudoku? " + isValid);
    }
        
public static boolean isValidSudoku(char[][] board) {
    Set<String> seen = new HashSet<>();
    
    for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
            char currVal = board[i][j];
            if (currVal != '.') {
                if (!seen.add(currVal + " in row " + i) ||
                    !seen.add(currVal + " in column " + j) ||
                    !seen.add(currVal + " in block " + i/3 + "-" + j/3)) {
                    return false;
                }
            }
        }
    }
    
    return true;
}

}

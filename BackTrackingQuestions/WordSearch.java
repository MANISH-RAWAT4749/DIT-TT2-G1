
public class WordSearch {
    public static boolean exist(char[][] board, String word) {
    if (board == null || board.length == 0 || board[0].length == 0) {
        return false;
    }

    int numRows = board.length;
    int numCols = board[0].length;

    for (int i = 0; i < numRows; i++) {
        for (int j = 0; j < numCols; j++) {
            if (board[i][j] == word.charAt(0) && dfs(board, word, i, j, 0)) {
                return true;
            }
        }
    }

    return false;
}

private static boolean dfs(char[][] board, String word, int row, int col, int index) {
    if (index == word.length()) {
        return true;
    }

    if (row < 0 || col < 0 || row >= board.length || col >= board[0].length || board[row][col] != word.charAt(index)) {
        return false;
    }

    char temp = board[row][col];
    board[row][col] = '#';

    boolean found =
        dfs(board, word, row + 1, col, index + 1) ||
        dfs(board, word, row - 1, col, index + 1) ||
        dfs(board, word, row, col + 1, index + 1) ||
        dfs(board, word, row, col - 1, index + 1);

    board[row][col] = temp;
    return found;
}


    public static void main(String[] args) {
        char[][] board = {
            { 'A', 'B', 'C', 'E' },
            { 'S', 'F', 'C', 'S' },
            { 'A', 'D', 'E', 'E' }
        };

        String word = "ABCCED";
        boolean exists = exist(board, word);
        System.out.println("Word Exists? " + exists);
    }
}

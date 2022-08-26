public class Main {
    public static void main(String[] args) {
        
    }
}

class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[][] row = new int[9][9]; 
        int[][] column = new int[9][9];
        int[][][] box = new int[3][3][9];

        for(int i = 0;i < board.length;i ++){
            for(int j = 0;j < board[0].length;j ++){
                if(board[i][j] == '.')
                    continue;
                int tmp = board[i][j] - '1';
                if(row[i][tmp] != 0 | column[j][tmp] != 0 | box[i/3][j/3][tmp] != 0)
                    return false;
                row[i][tmp] = 1;
                column[j][tmp] = 1;
                box[i/3][j/3][tmp] = 1;
            }
        }

        return true;
    }
}
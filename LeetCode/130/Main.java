public class Main {
    public static void main(String[] args) {
        char[][] board = new char[][]{{'X','O','X','O','X','O'},{'O','X','O','X','O','X'},
                                        {'X','O','X','O','X','O'},{'O','X','O','X','O','X'}};
        new Solution().solve(board);
        for(char[] line : board){
            System.out.println(line);
        }
    }
}

class Solution {
    public void solve(char[][] board) {
        int m = board.length;
        int n = board[0].length;
        for(int i = 1;i < m - 1;i ++){
            for(int j = 1;j < n - 1;j ++){
                if(board[i][j] == 'X');
                else{
                    if(judge(i, j, board)){
                        board[i][j] = 'X';
                    }
                }
            }
        }
    }
    public boolean judge(int i, int j, char[][] board){
        int a = 0;
        //
        for(a = 0;a < i;a ++){
            if(board[a][j] == 'X'){
                break;
            }
        }
        if(a == i) return false;
        for(a = i + 1;a < board.length;a ++){
            if(board[a][j] == 'X'){
                break;
            }
        }
        if(a == board.length) return false;
        //
        for(a = 0;a < j;a ++){
            if(board[i][a] == 'X'){
                break;
            }
        }
        if(a == j) return false;
        for(a = j + 1;a < board[0].length;a ++){
            if(board[i][a] == 'X'){
                break;
            }
        }
        if(a == board[0].length) return false;
        //
        return true;
    }
}
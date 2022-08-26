import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author mqy
 * 输入样例：
 * 4
 * PAYPALISHIRING
 */

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Solution solution = new Solution();
        int numRows = in.nextInt();
        String s = new String(in.next());
        System.out.println(solution.convert(s, numRows));
        in.close();
    }
}

// class Solution {
//     public String convert(String s, int numRows) {
//         if(numRows == 1) return s;
//         int sLen = s.length();
//         String res = new String();
//         char[][] mat = new char[numRows+1][sLen+1];
//         for(int i = 1;i <= sLen;i ++){
//             int p = i % (2 * numRows - 2);
//             if(p == 0) p += 2 * numRows - 2;
//             int q = i / (2 * numRows - 2);
//             if(i % (2 * numRows - 2) == 0) q--;
//             if(p <= numRows) mat[p][1 + q * (numRows - 1)] = s.charAt(i-1);
//             else mat[2 * numRows - p][1 + q * (numRows - 1) + p - numRows] = s.charAt(i-1);
//         }
//         for(int i = 1;i <= numRows;i ++){
//             for(int j = 1;j <= sLen;j ++){
//                 if(mat[i][j] != '\u0000') res+=mat[i][j];
//             }
//         }
//         return res;
//     }
// }

/**
 * 交错append到不同列
 */
class Solution{
    public String convert(String s, int numRows){
        if(numRows == 1) return s;

        ArrayList<StringBuilder> rows = new ArrayList<>();
        for(int i = 0;i <= Math.min(s.length(), numRows);i ++){
            rows.add(new StringBuilder());
        }
        int currRow = 0;boolean down = false;
        for(char c : s.toCharArray()){
            rows.get(currRow).append(c);
            if(currRow == 0 || currRow == numRows - 1) down = ! down;
            if(down == true) currRow++;
            else currRow--;
        }
        StringBuilder res = new StringBuilder();
        for(StringBuilder row : rows) res.append(row);
        return res.toString();
    }
}


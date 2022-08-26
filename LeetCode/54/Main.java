import java.util.*;

public class Main{
    public static void main(String[] args) {
        int[][] matrix = new int[3][4];
        matrix[0] = new int[]{1,2,3,4};
        matrix[1] = new int[]{5,6,7,8};
        matrix[2] = new int[]{9,10,11,12};
        // int[][] matrix = new int[3][3];
        // matrix[0] = new int[]{1,2,3};
        // matrix[1] = new int[]{4,5,6};
        // matrix[2] = new int[]{7,8,9};
        Solution solution = new Solution();
        System.out.println(solution.spiralOrder(matrix));
    }
}

class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> res = new ArrayList<>(); 
        int size = matrix.length * matrix[0].length;
        boolean[][] visited = new boolean[matrix.length][matrix[0].length];
        int direction = 0;
        int x = 0;int y = 0;
        for(int i = 0;i < size;i ++){
            res.add(matrix[x][y]);
            visited[x][y] = true;
            if(direction == 0)
        }
    }
}
import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.solveNQueens(8));
    }
}

class Solution {

    List<List<String>> res = new ArrayList<>();

    public List<List<String>> solveNQueens(int n) {
        get(new int[n], 0, n);
        return res;
    }

    void get(int[] array, int ptr, int n){
        if(ptr == n) {
            convert(array, n);
            return;
        }
        for(int i = 1;i <= n;i ++){
            array[ptr] = i;
            if(judge(array, ptr, n)) get(array, ptr+1, n);
        }
    }

    void convert(int[] array,int n){
        List<String> tmp = new ArrayList<>();
        for(int i = 0;i <= n - 1;i ++){
            StringBuffer s = new StringBuffer();
            for(int j = 1;j <= n;j ++){
                if(array[i] == j) s.append("Q");
                else s.append(".");
            }
            tmp.add(s.toString());
        }
        res.add(tmp);
    }

    boolean judge(int[] array, int ptr, int n){
        for(int i = 0;i <= ptr - 1;i ++){
            if(array[i] == array[ptr] || Math.abs(array[i]-array[ptr]) == Math.abs(i-ptr))
                return false;
        }
        return true;
    }
}


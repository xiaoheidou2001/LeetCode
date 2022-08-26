import java.util.ArrayList;
import java.util.List;

public class Main{
    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.generateParenthesis(5));
    }
}

class Solution {

    List<String> list = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        int[] res = new int[2*n];
        int i = 0;
        get(res, i, n);
        return list;
    }

    void get(int[] res,int i,int n){
        if(i == 2 * n){
            add(res, n);
            return;
        }
        //left : 1
        res[i] = 1;
        if(judge(res, i, n)) get(res, i+1, n);
        //right : -1
        res[i] = -1;
        if(judge(res, i, n)) get(res, i+1, n);
    }

    boolean judge(int[] res,int i,int n){
        int sum = 0;
        for(int j = 0;j <= i;j ++) sum += res[j];
        if(sum < 0 || sum > Math.abs(2 * n - 1 - i)) return false;
        return true;
    }

    void add(int[] res,int n){
        String s = new String();
        for(int i = 0;i <= 2 * n - 1;i ++){
            if(res[i] == 1) s += "(";
            else s += ")";
        }
        list.add(s);
    }
}
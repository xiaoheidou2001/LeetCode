import java.util.HashSet;
import java.util.Set;

public class Main{
    public static void main(String args[]){
        System.out.println(new Solution().isHappy(2));
        System.out.println(new Solution().isHappy(19));
    }
}

class Solution {
    public boolean isHappy(int n) {
        Set<Integer> resSet = new HashSet<>();
        while(!resSet.contains(n)){
            if(n == 1) return true;
            resSet.add(n);
            n = getRes(n);
        }
        return false;
    }
    public int getRes(int n){
        int res = 0;
        while(n != 0){
            res += Math.pow(n % 10, 2);
            n /= 10;
        }
        return res;
    }
}
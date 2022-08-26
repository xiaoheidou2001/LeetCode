import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println(new Solution().divide(in.nextInt(), in.nextInt())); 
        in.close();
    }
}

class Solution {
    public int divide(int dividend, int divisor) {
        double dividendP = dividend*(dividend>0?1:-1);
        double divisorP = divisor*(divisor>0?1:-1);
        double divisorSum = 0;double i = 0;
        for(i = 0;divisorSum <= dividendP;i ++){
            divisorSum += divisorP;
        }
        if((i-1) > Math.pow(2,31)-1 | (i-1) < -Math.pow(2,31)) return (int)(Math.pow(2,31)-1);
        return (int)((i-1)*(dividend*divisor>0?1:-1));
    }
}
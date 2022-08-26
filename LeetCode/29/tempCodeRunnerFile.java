class Solution {
    public int divide(int dividend, int divisor) {
        int dividendP = Math.abs(dividend);
        int divisorP = Math.abs(divisor);
        int divisorSum = 0;int i = 0;
        for(i = 0;divisorSum <= dividendP;i ++){
            divisorSum += divisorP;
        }
        return (i-1)*(dividend*divisor>0?1:-1);
    }
}
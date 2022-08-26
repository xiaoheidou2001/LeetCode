public class Main{
    public static void main(String[] args) {
        int[] prices = new int[]{7,1,5,3,6,4};
        System.out.println(new Solution().maxProfit(prices));
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int maxPrice = 0;
        int maxProfit = 0;
        for(int i = prices.length-1;i >= 0;i --){
            maxPrice = Math.max(maxPrice, prices[i]);
            maxProfit = Math.max(maxProfit, maxPrice-prices[i]);
        }
        return maxProfit;
    }
}
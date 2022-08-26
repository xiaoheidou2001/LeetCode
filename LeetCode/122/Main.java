public class Main{
    public static void main(String[] args) {
        int[] prices = new int[]{1,2,3,4,5};
        System.out.println(new Solution().maxProfit(prices));
    }
}

class Solution {
    public int maxProfit(int[] prices) {
        int day = 0;
        int profit = 0;
        while(day < prices.length - 1){
            if(prices[day+1] > prices[day]){
                profit += prices[day+1] - prices[day];
            }
            day++;
        }
        return profit;
    }
}
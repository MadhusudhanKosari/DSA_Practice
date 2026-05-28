class Solution {
    public int maxProfit(int[] prices) {
        int buy = prices[0];
        int sell = 0;
        for(int num : prices){
            buy = Math.min(buy,num);
            sell = Math.max(sell,num-buy);
        }
        return sell;
    }
}
class Solution {
    public int maxProfit(int[] prices) {
       int maxP = 0;
       
       for(int i = 0 ; i < prices.length ; i++){
        int start = prices[i];
            for(int j = i; j < prices.length ; j++)
            if(prices[j] - start > maxP) maxP = prices[j] - start;
       } 



        return maxP;
    }
}


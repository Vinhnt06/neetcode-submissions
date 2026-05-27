class Solution {
    public int maxProfit(int[] prices) {
       int maxP = 0;
       int minPrice = Integer.MAX_VALUE;
      
      for(int i = 0 ; i< prices.length ; i++){
        minPrice = Math.min(prices[i],minPrice);
        maxP = Math.max(prices[i]-minPrice,maxP);
      }
        return maxP;
    }
}


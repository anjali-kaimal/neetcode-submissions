class Solution {
    public int maxProfit(int[] prices) {
      // keep first element as cheapestbuy and 0 as profit to begin with
      int cheapestbuy=prices[0],bestProfit=0;
      // loop thru elements
     for(int i=1;i<prices.length;i++){
      // check next bestprofit
        if(prices[i]-cheapestbuy>bestProfit)
        bestProfit=prices[i]-cheapestbuy;
        // check next cheapestbuy
        if(prices[i]<cheapestbuy)
        cheapestbuy=prices[i];
     }
     return bestProfit;
    }
}

class Solution {
    public int maxProfit(int[] prices) {
      // keep first element as cheapestbuy and 0 as profit to begin with
      int cheapestbuy=prices[0],bestProfit=0;
      // loop thru elements
     for(int price:prices){
      // check next bestprofit
        if(price-cheapestbuy>bestProfit)
        bestProfit=price-cheapestbuy;
        // check next cheapestbuy
        if(price<cheapestbuy)
        cheapestbuy=price;
     }
     return bestProfit;
    }
}

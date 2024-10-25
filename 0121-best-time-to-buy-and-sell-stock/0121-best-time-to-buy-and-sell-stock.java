class Solution {
    public int maxProfit(int[] prices) {
      int mini=prices[0];
      int maxprofit=0;
    
      for(int i=1; i<prices.length; i++){
            if(mini<prices[i]){
                maxprofit=Math.max(prices[i]-mini,maxprofit);
            }
            else{
                mini=prices[i];
            }
        } 
      return maxprofit;
    }
}
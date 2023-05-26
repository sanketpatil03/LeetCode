class Solution {
    public int maxProfit(int[] prices) {
         int minimum=Integer.MAX_VALUE;
        int maxprofit=0;
        for(int i=0;i<prices.length;i++)
        {
            if(minimum<prices[i]){
                 maxprofit=Math.max(maxprofit,(prices[i]-minimum));
            }
           else
           {
               minimum=prices[i];
           }    
        }
        return maxprofit;
    }
}
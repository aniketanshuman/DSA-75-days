class Solution {
    public int maxProfit(int[] prices) {
        if(prices==null||prices.length<=1)
        return 0;
 
    int low=prices[0];
    int result=0;
 
    for(int i=1; i<prices.length; i++){
        result = Math.max(result, prices[i]-low);
        low = Math.min(low, prices[i]);
    }
 
    return result;
    }
}
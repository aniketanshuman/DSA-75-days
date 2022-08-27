class Solution {
    public int maxProfit(int[] prices) {
       int[][] dp = new int[(prices.length)+1][2];
       for(int[] row:dp)
           Arrays.fill(row, -1);
       int ans = sol(prices, 0, 0, dp);
        return ans;
    }
    public int sol(int[] prices, int buy, int ind, int[][] dp){
        if(ind == prices.length) return 0;
        if(dp[ind][buy]!=-1) return dp[ind][buy];
        int profit =0;
        if(buy == 1){
          int pick = prices[ind] + sol(prices, 0, ind+1, dp);
          int notPick = sol(prices, 1, ind+1, dp);
           profit = Math.max(pick, notPick);  
        }
        else{
            int take = -prices[ind] + sol(prices, 1, ind+1, dp);
            int notTake = sol(prices, 0, ind+1, dp);
             profit = Math.max(take, notTake);
        }
        return dp[ind][buy] = profit;
    }
}
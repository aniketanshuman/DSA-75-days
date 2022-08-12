class Solution {
    public int coinChange(int[] coins, int amount) {
        Integer[][] dp = new Integer[coins.length + 1][amount + 1];
    
        int ans = coinChange_Memo(coins, coins.length, amount, dp);
        return ans == (int)1e9 ? -1 : ans;
    }
    
    public static int coinChange_Memo(int[] coins, int n, int amount, Integer[][] dp) {
        if(amount == 0 || n == 0) {
            if(amount == 0) {
                return dp[n][amount] = 0;
            }
            return dp[n][amount] = (int)1e9;
        }
    
        if(dp[n][amount] != null) return dp[n][amount];
        
        int min1 = (int)1e9;
        int min2 = (int)1e9;
        if(amount - coins[n - 1] >= 0){
           min1 = coinChange_Memo(coins, n, amount - coins[n - 1], dp) + 1;
        }
        min2 = coinChange_Memo(coins, n - 1, amount, dp);
        return dp[n][amount] = Math.min(min1, min2);
    }
}
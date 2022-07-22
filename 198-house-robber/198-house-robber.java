class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        int x = maxMoney(n-1, nums, dp);
        return x;
    }
    public int maxMoney(int index, int[] nums, int[] dp){
//         if(index == 0) return nums[index];
//         if(index == -1) return 0;
//         if(dp[index] != -1) return dp[index];
        
//         int take = nums[index] + maxMoney(index - 2, nums, dp);
//         int not_take = 0 + maxMoney(index - 1, nums, dp);
        dp[0] = nums[0];
        for(int i=1; i<nums.length; i++){
            int take = nums[i];
            if(i > 1){
                take += dp[i - 2];
            }
            int not_take = 0 + dp[i - 1];
            dp[i] =  Math.max(take, not_take);
        }
        return dp[index];
    }
}
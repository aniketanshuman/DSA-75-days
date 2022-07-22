class Solution {
    public int rob(int[] nums) {
        int n = nums.length;
        int[] dp = new int[n];
        Arrays.fill(dp,-1);
        int x = maxMoney(n-1, nums, dp);
        return x;
    }
    public int maxMoney(int index, int[] nums, int[] dp){
        if(index == 0) return nums[index];
        if(index == -1) return 0;
        if(dp[index] != -1) return dp[index];
        
        int take = nums[index] + maxMoney(index - 2, nums, dp);
        int not_take = 0 + maxMoney(index - 1, nums, dp);
        return dp[index] =  Math.max(take, not_take);
    }
}
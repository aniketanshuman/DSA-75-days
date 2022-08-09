class Solution {
    public boolean canPartition(int[] nums) {
        int n = nums.length;
        int sum =0;
        
        for(int i = 0; i< n; i++){
            sum+=nums[i];
        }
        int dp[][] = new int[n][(sum/2)+1];
        for(int row[]: dp){
            Arrays.fill(row, -1);
        }
        if(sum%2!=0) return false;
        else{
        boolean ans = solution(n-1, sum/2, n, nums, dp);
            return ans;
            }
    }
    public boolean solution(int index, int sum, int n, int nums[], int dp[][]){
        if(sum == 0) return true;
        if(index == 0) return nums[index] == sum;
        if(dp[index][sum] != -1) return dp[index][sum]==0?false:true;
            boolean notTake = solution(index-1, sum, n, nums, dp);
            boolean take = false;
            if(nums[index] <= sum)
                take = solution(index-1, sum-nums[index], n, nums, dp);
                dp[index][sum]=notTake||take?1:0;
            return notTake || take;
    }
}
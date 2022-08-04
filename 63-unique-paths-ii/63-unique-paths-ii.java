class Solution {
    public int uniquePathsWithObstacles(int[][] obstacleGrid) {
        int m = obstacleGrid.length;
        int n = obstacleGrid[0].length;
        int dp[][] = new int[m][n];
        for(int row[]: dp)
        Arrays.fill(row,-1);
        int ans = solution(m-1, n-1, obstacleGrid, dp);
        return ans;
    }
    public int solution(int i, int j, int[][] grid, int[][] dp){
        if(i<0 || j<0 || grid[i][j]==1) return 0;
        if(i==0 && j==0) return 1;
        if(dp[i][j]!=-1) return dp[i][j];
        int up=solution(i-1,j,grid,dp);
        int left=solution(i,j-1,grid,dp);
        
        return dp[i][j]=up+left;
    }
}
class Solution {
    public int uniquePaths(int m, int n) {
        int dp[][]=new int[m][n];
        unique(0,0,m,n,dp);
        
        return dp[0][0];
    }
    public int unique(int i , int j , int m, int n,int dp[][]){
        if(i>=m || j>=n){
            return 0;
        }
        if(i==m-1 && j==n-1){
            return dp[i][j]=1;
        }
       
        if(dp[i][j]!=0){
            return dp[i][j];
        }
        return dp[i][j]=unique(i+1,j,m,n,dp) + unique(i,j+1,m,n,dp);
    }
}
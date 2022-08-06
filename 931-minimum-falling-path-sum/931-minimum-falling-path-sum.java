class Solution {
    public int minFallingPathSum(int[][] a) {
        int min = Integer.MAX_VALUE;
        int m = a.length;
        int n = a[0].length;
        int[][] dp=new int[m][n];
        for(int[] row: dp) Arrays.fill(row,-1);
        for(int j = 0; j<n; j++){
            int temp = help(m-1,j,a,dp);
            min = Math.min(min,temp);
        }
        return min;
    }
    public int help(int i, int j, int[][] a,int[][] dp){
        
        if(i<0 || j<0 || j>a[0].length-1) return (int)Math.pow(10,9);
        if(i==0) return a[i][j];
        if(dp[i][j] != -1) return dp[i][j];
        int left = a[i][j] + help(i-1,j-1,a,dp);
        int up = a[i][j] + help(i-1,j,a,dp);
        int right = a[i][j] + help(i-1,j+1,a,dp);
        
        return dp[i][j] = Math.min(left,Math.min(up,right));
    }
}
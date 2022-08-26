class Solution {
    static int prime =(int)(Math.pow(10,9)+7);
    public int numDistinct(String s, String t) {
        int n = s.length();
        System.out.println(n);
        int m = t.length();
        int dp[][] = new int[n+1][m+1];
        for(int[] row: dp){
            Arrays.fill(row, -1);
        }
        int ans = ds(s,t,n,m,dp);
        return ans;
    }
    public int ds(String s1, String s2, int n, int m, int[][] dp){
        // if(n<0) return 0;
        // if(m<0) return 1;
        // if(dp[n][m]!=-1) return dp[n][m];
        // if(s.charAt(n) == t.charAt(m)){
        //    dp[n][m] = (ds(s,t,n-1,m-1,dp) + ds(s,t,n-1,m,dp));
        //     return dp[n][m]%prime;
        // }
        // else{
        //     return dp[n][m] = ds(s,t,n-1,m,dp);
        // }
        for(int i=0;i<n+1;i++){
        dp[i][0]=1;
    }
    for(int i=1;i<m+1;i++){
        dp[0][i]=0;
    }
    
    for(int i=1;i<n+1;i++){
        for(int j=1;j<m+1;j++){
            
            if(s1.charAt(i-1)==s2.charAt(j-1))
                dp[i][j] = (dp[i-1][j-1] + dp[i-1][j])%prime;
            else
                dp[i][j] = dp[i-1][j];
        }
    }
    
    
    return dp[n][m];
    }
}
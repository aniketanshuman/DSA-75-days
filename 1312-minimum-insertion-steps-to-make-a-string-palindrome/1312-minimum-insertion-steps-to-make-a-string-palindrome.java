class Solution {
    public int minInsertions(String s1) {
        int n = s1.length();
        int dp[][] = new int[n+1][n+1];
        for(int[] row: dp)
                Arrays.fill(row, -1);
        String s2 = reverse(s1);
        System.out.println(s2);
        int x = longestPalindromeSub(s1,s2, n-1, n-1, dp);
        return n-x;
    }
    public int longestPalindromeSub(String s1, String s2, int ind1, int ind2, int dp[][]){
        if(ind1<0 || ind2<0) return 0;
        if(dp[ind1][ind2] != -1) return dp[ind1][ind2];
        if(s1.charAt(ind1) == s2.charAt(ind2)){
            dp[ind1][ind2] =1+longestPalindromeSub(s1,s2,ind1-1,ind2-1, dp);
        }
        else{
            dp[ind1][ind2] = Math.max(longestPalindromeSub(s1,s2,ind1-1,ind2, dp), longestPalindromeSub(s1,s2,ind1,ind2-1, dp));
        }
        return dp[ind1][ind2];
    }
    public String reverse(String s1){
        String s2=new StringBuilder(s1).reverse().toString();
        return s2;
    }
}
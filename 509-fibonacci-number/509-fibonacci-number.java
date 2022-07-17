class Solution {
    public int fib(int n) {
        // if(n==0){
        //     return 0;
        // }
        // else if(n==1){
        //     return 1;
        // }
        // else{
        //     return fib(n-1)+fib(n-2);
        // }
        /* Dynamic programming solution */
        int dp[] = new int[n+1];
        if(n<=1) return n;
        if(dp[n] != 0)
            return dp[n];
        else
            return dp[n] = fib(n-1) + fib(n-2);
    }
}
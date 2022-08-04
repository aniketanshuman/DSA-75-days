class Solution {
    public int minimumTotal(List<List<Integer>> triangle) {
        int[][] dp = new int[triangle.size()][triangle.size()];
        List<Integer> lastRow = triangle.get(triangle.size() - 1);
        for (int i = 0; i < lastRow.size(); i++)
            dp[triangle.size() - 1][i] = lastRow.get(i);

        for (int i = triangle.size() - 2; i > -1; i--) {
            List<Integer> row = triangle.get(i);
            for (int j = 0; j < row.size(); j++) {
                int maxSumLeft = dp[i + 1][j];
                int maxSumRight = dp[i + 1][j + 1];
                int currentValue = row.get(j);
                int sumPath = currentValue + Math.min(maxSumLeft, maxSumRight);
                dp[i][j] = sumPath;
            }
        }
        return dp[0][0];
    }
}
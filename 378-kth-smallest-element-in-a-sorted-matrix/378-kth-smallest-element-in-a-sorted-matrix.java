class Solution {
    public int kthSmallest(int[][] matrix, int k) {
        int n = matrix[0].length;
        int arr[] = new int[n*n];
        int l = 0;
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                arr[l] = matrix[i][j];
                l++;
            }
        }
        Arrays.sort(arr);
        return arr[k-1];
    }
}
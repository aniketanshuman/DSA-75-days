class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length;
        int n = nums2.length;
        int res[] = new int[m+n];
        for(int i=0;i<m;i++){
            res[i] = nums1[i]; 
        }
        for(int j=0;j<n;j++){
            res[m + j] = nums2[j];
            
        }
        Arrays.sort(res);
       
        if((m+n)% 2 !=0 ){
            double z =  res[(m+n)/2];
            return z;
        }
        else{
            double x = res[(m+n-1)/2];
            double y = res[((m+n-1)/2) + 1];
            System.out.println((x+y)/2);
            return (x+y)/2;
        }
    }
}
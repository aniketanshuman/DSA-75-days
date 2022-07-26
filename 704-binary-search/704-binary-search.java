class Solution {
    public int search(int[] nums, int target) {
        int left = 0;
        int right = nums.length - 1;
        int ans = binarySearch(nums, target, left, right);
        return ans;
    }
    public int binarySearch(int[] nums, int target, int left, int right){
        if(right >= left){
            int mid = left + (right-left)/2;
            if(nums[mid] == target) return mid;
            else if(nums[mid]>target) return binarySearch(nums, target, left, mid-1);
            else return binarySearch(nums, target, mid+1, right);
        }
        else
            return -1;
    }
}
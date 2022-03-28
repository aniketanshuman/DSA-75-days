public class Solution {
    public void nextPermutation(int[] nums) {
        if(nums.length < 2) return;

        int p = -1;

        for(int i = nums.length - 1; i > 0; i--){
            if(nums[i] > nums[i - 1]){
                p = i - 1;
                break;
            }
        }

        if( p == -1){
            Arrays.sort(nums);
            return;
        }else{
            int c = -1;
            for(int i = nums.length - 1; i >= 0; i--){
                if(nums[i] > nums[p]){
                    c = i;
                    break;
                }
            }

            swap(nums, p, c);
            Arrays.sort(nums, p + 1, nums.length);
            return;
        }
    }

    void swap(int[] nums, int index1, int index2){
        int temp = nums[index1];
        nums[index1] = nums[index2];
        nums[index2] = temp;
    }


}
class Solution {
    public int rob(int[] nums) {
        ArrayList<Integer> arr1 = new ArrayList<>();
        ArrayList<Integer> arr2 = new ArrayList<>();
        int n = nums.length;
        if(n==1)
       return nums[0];
        for(int i=0;i<nums.length; i++){
            if(i!=0) arr1.add(nums[i]);
            if(i!=(n-1)) arr2.add(nums[i]);
        }
        return Math.max(sum(arr1, n), sum(arr2, n));
    }
    public int sum(ArrayList<Integer> ans, int n){
    int prev = ans.get(0);
    int prev2 =0;
    
    for(int i=1; i<ans.size(); i++){
        int pick = ans.get(i);
        if(i>1)
            pick += prev2;
        int nonPick = 0 + prev;
        
        int cur_i = Math.max(pick, nonPick);
        prev2 = prev;
        prev= cur_i;
        
    }
    return prev;
        }        
    }

class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> ans = new ArrayList<>();
        subset2(0, nums, ans, new ArrayList<>());
        return ans;
    }
    public void subset2(int index, int[] nums, List<List<Integer>> ans, List<Integer> ds ){
        ans.add(new ArrayList<>(ds));
        for(int i = index; i< nums.length; i++){
            if(i!=index && nums[i] == nums[i-1])continue;
            ds.add(nums[i]);
            subset2(i+1, nums, ans, ds);
            ds.remove(ds.size() - 1);
        }
    }
}
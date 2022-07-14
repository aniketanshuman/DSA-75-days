class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinationSum(candidates, target, 0, ans, new ArrayList<>());    
            return ans;
    }
    
    private void findCombinationSum(int[] candidates, int target, int index, List<List<Integer>> ans,  List<Integer> ds){
        if(index == candidates.length){
            if(target == 0){
                ans.add(new ArrayList<>(ds));
            }
         return;
        }
        if(candidates[index] <= target){
            ds.add(candidates[index]);
            findCombinationSum(candidates, target-candidates[index], index, ans, ds );
            ds.remove(ds.size() - 1);               
        }
        findCombinationSum(candidates, target, index + 1, ans, ds );
    }
}
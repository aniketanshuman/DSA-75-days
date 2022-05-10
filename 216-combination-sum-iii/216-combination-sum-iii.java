class Solution {
    List<List<Integer>> list;
    public void helper(List<Integer> l, int sum, int k, int n, int start){
        if(sum > n || l.size() > k) return;
        if(sum == n){
            if(l.size() < k) return;
            list.add(new ArrayList(l));
            return;
        }
        for(int i = start; i <= 9; i++){
            l.add(i);
            helper(l, sum + i, k, n, i + 1);
            l.remove(l.size() - 1);
        }
        return;
    }
    
    public List<List<Integer>> combinationSum3(int k, int n) {
        list = new ArrayList<>();
        helper(new ArrayList<Integer>(), 0, k, n, 1);
        return list;
    }
}
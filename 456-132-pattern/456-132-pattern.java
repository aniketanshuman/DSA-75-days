class Solution {
    public boolean find132pattern(int[] nums) {
        int n = nums.length;
        int[] min = new int[n];
        int[] idx = new int[n];
        Stack<int[]> st = new Stack<>();
        
        min[0] = nums[0];
        for (int i = 1; i < n; i++) {
            min[i] = Math.min(min[i - 1], nums[i]);
            idx[i] = -1;
        }
        
        for (int i = n - 1; i >= 0; i--) {
            while (!st.isEmpty() && nums[i] > st.peek()[0]) {
                int[] cur = st.pop();
                idx[cur[1]] = i;
            }
            st.push(new int[] {nums[i], i});
        }
        
        for (int i = n - 1; i >= 0; i--) {
            if (idx[i] != -1 && min[idx[i]] < nums[i]) {
                return true;
            }
        }
        return false;
    }
}

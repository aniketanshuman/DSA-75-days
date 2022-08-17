class Solution {
    public List<Integer> findClosestElements(int[] arr, int k, int x) {
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>((a,b)->Math.abs(a-x) - Math.abs(b-x) == 0 ? a - b : Math.abs(a-x) - Math.abs(b-x));
        List<Integer> result = new ArrayList<>();
        for(int i : arr)
            pq.add(i);
        for(int i = 0; i< k; i++){
            result.add(pq.poll());
        }
        Collections.sort(result);
        return result;
    }
}
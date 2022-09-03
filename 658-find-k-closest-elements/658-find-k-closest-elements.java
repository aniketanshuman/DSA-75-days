class Pair{
    int diff;
    int elem;
    Pair(int diff, int elem){
        this.diff = diff;
        this.elem = elem;
    }
}
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
        // PriorityQueue<Pair> pq = new PriorityQueue<Pair>(Collections.reverseOrder());
        // List<Integer> ans = new ArrayList<>();
        //  // pq.add(new Pair(Math.abs(arr[0]-x), arr[2]));
        // for(int i=0; i< arr.length; i++){
        //     pq.add(new Pair(Math.abs(arr[i]-x), arr[i]));
        //     if(pq.size()>k){
        //         pq.poll();
        //     }
        // }
        // while(!pq.isEmpty()){
        //     Pair it = pq.peek();
        //     ans.add(it.elem);
        //     pq.poll();
        // }
        // return ans;
    }
}
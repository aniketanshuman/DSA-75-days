class Solution {
    public boolean reorderedPowerOf2(int n) {
        int[] arr = countDigits(n);
        int num = 1;
        for(int i=0;i<30;i++){
            if(Arrays.equals(arr, countDigits(num))){
                return true;
            }
            num = num << 1;
        }
        return false;
    }
    public int[] countDigits(int n){
     int[] arr = new int[10];
        while(n>0){
            arr[n%10]++;
            n=n/10;
        }
        return arr;
    }
}
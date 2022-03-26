class Solution {
    public int majorityElement(int[] num) {
if (num.length == 1) {
return num[0];
}
Arrays.sort(num);
return num[num.length / 2];
}
}
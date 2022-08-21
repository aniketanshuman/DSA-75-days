class Solution {
    public void reverseString(char[] c) {
        int i =0;
        int j = c.length-1;
        while(i<j){
          swap(c, i, j);
            i++;
            j--;
        }
    }   
    public void swap(char[] c, int i, int j){
        char temp = c[i];
        c[i] = c[j];
        c[j] = temp;
    }
}
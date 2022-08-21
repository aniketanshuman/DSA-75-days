class Solution {
    public int longestPalindrome(String s) {
        HashSet<Character> hs = new HashSet<>();
        int count  = 0 ;
        for(int i=0;i<s.length();i++){
            if(hs.contains(s.charAt(i))){
              hs.remove(s.charAt(i));
              count++;  
            }
            else{
                hs.add(s.charAt(i));
            }
        }
        if(!hs.isEmpty()){
            return count*2+1;
        }
        else{
            return count*2;
        }
    }
}
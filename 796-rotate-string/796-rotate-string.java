class Solution {
    public boolean rotateString(String s, String goal) {
       
        for(int j=1;j<s.length();j++){
         StringBuilder sb = new StringBuilder();
            for(int i=j;i<s.length();i++){
              sb.append(s.charAt(i));
            }
            for(int i=0;i<j;i++){
              sb.append(s.charAt(i));
           }
            if(goal.equals(sb.toString())){
                return true;
            }
        }
        return false;
    }
}
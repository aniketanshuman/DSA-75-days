class Solution {
    public String removeDuplicates(String s, int k) {
        int j=0;
        char[] st=s.toCharArray();
        int count[]=new int[s.length()];
        for(int i=0;i<s.length();i++)
        {
            st[j]=s.charAt(i);
            count[j]=j>0 && st[j]==st[j-1]?count[j-1]+1:1;
            if(count[j]==k)
                j=j-k;
            j++;
            
            
        }
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<j;i++)
            sb.append(st[i]);
        return sb.toString();
    }
}
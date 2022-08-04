class Solution {
    public int mirrorReflection(int p, int q) {
        int a=p;
        int b=q;
        while(a%2==0 && b%2==0)
        {
            a/=2;
            b/=2;
        }
        if(a%2==0 && b%2!=0)
        {
            return 2;
        }
        else if(a%2!=0 && b%2!=0)
        {
            return 1;
        }
        else if(a%2!=0 && b%2==0)
        {
            return 0;
        }
        return -1;
    }
}
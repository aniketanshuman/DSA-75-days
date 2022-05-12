class Solution {
    public int countVowelStrings(int n) {
        //Combination of 5 vowels n times (n + 5 - 1)! / (n! * (5 - 1)!) 
        return (n+4)*(n+3)*(n+2)*(n+1)/24;
    }
}
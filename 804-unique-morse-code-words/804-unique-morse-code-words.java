class Solution {
    public int uniqueMorseRepresentations(String[] words) {
        String [] encoding = {".-","-...","-.-.","-..",".","..-.","--.","....","..",".---","-.-",".-..","--","-.","---",".--.","--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
    
    HashMap<String, Integer> hmap = new HashMap<>();
    
    for(int i=0; i<words.length; i++) {
        String s = "";
        for(int j=0; j<words[i].length(); j++) {
            char c = words[i].charAt(j);
            int k = c-'a';
            s += encoding[k];
        }
        if(!hmap.containsKey(s)) {
            hmap.put(s,1);
        }
        s="";
    }
    
    return hmap.size();
    }
}
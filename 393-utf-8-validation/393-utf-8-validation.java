class Solution {
   private int[] masks = {128, 64, 32, 16, 8};
    public boolean validUtf8(int[] data) {
        int len = data.length;
        for (int i = 0; i < len; i ++) {
            int curr = data[i];
            int type = getType(curr);
            if (type == 0) {
                continue;
            } else if (type > 1 && i + type <= len) {
                while (type-- > 1) {
                    if (getType(data[++i]) != 1) {
                        return false;
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }
    
    public int getType(int num) {
        for (int i = 0; i < 5; i ++) {
            if ((masks[i] & num) == 0) {
                return i;
            }
        }
        return -1;
    }
}
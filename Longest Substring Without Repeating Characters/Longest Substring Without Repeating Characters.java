class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (j - i + 1 > max) {
                    if (checkrepeating(s, i, j)) {
                        max = j-i+1;
                    }
                    else break;
                }
            }
        }
        return max;
    }

    public boolean checkrepeating(String s,int l,int h){
        boolean arr[] = new boolean[256];
        for(int i=l;i<=h;i++){
            if(arr[s.charAt(i)] == true)return false;
            else arr[s.charAt(i)] = true;
        }
        return true;
    }
}

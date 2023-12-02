class Solution {
    public int rearrangeCharacters(String s, String target) {
        int str[] = new int[26];
        int tar[] = new int[26];
        for(int i=0;i<s.length();i++){
            str[s.charAt(i)-'a']++;
        }
        for(int i=0;i<target.length();i++){
            tar[target.charAt(i)-'a']++;
        }

        int temp = 0;
        int min = Integer.MAX_VALUE;
        for(char ch : target.toCharArray()) {
            int x = str[ch-'a'];
            int y = tar[ch-'a'];
            if(x >= y) {
                min = Math.min(min, x/y);
                temp++;
            }
            else{
                break;
            }
        }
        return temp==target.length() ? min : 0;
    }
}

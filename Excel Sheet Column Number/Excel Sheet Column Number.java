class Solution {
    public int titleToNumber(String s) {
        int result = 0;
        for(char c : s.toCharArray())
        {
            int d = c - (int)'A' + 1;
            result = result * 26 + d;
        }
        return result;
    }
}

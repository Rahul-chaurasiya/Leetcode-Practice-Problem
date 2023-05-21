class Solution {
    public String makeSmallestPalindrome(String s) {
        char[] chars = s.toCharArray();
        int n = chars.length;
        
        for (int i = 0; i < n / 2; i++) {
            if (chars[i] != chars[n - i - 1]) {
                chars[i] = chars[n - i - 1] = (char) Math.min(chars[i], chars[n - i - 1]);
            }
        }
        
        return String.valueOf(chars);
    
    }
}

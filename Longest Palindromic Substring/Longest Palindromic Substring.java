class Solution {
    public String longestPalindrome(String s) {
        int max = 0;
        String ans = "";
        for (int i = 0; i < s.length(); i++) {
            for (int j = 0; j < s.length(); j++) {
                if (j - i + 1 > max) {
                    if (checkpalindrome(s, i, j)) {
                        max = j - i + 1;
                        ans = s.substring(i, j + 1);
                    }
                }
            }
        }
        return ans;
    }

    public boolean checkpalindrome(String s, int low, int high) {
        while (low < high) {
            if (s.charAt(low) != s.charAt(high)) {
                return false;
            }
            low++;
            high--;
        }
        return true;
    }
}

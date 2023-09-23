class Solution {
    public boolean isSubsequence(String s2, String s1) {
        if(s1.length()<s2.length()) return false;
        int j=0;
        for (int i = 0; i < s1.length() && j<s2.length(); i++) {
            if (s1.charAt(i) == s2.charAt(j)) j++;
        }
        return (j==s2.length());
    }
}
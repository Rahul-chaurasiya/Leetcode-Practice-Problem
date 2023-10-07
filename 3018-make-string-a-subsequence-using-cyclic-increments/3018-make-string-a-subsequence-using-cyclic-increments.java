class Solution {
    public boolean canMakeSubsequence(String str1, String str2) {
        if(str1.length()<str2.length()) return false;
        int j=0;
        for(int i=0;i<str1.length()&&j<str2.length();i++){
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(j);
            char change = (ch1=='z')?'a':(char)(ch1+1);
            if(ch1 == ch2 || change == ch2) j++;
        }
        return j==str2.length();
    }
}
class Solution {
    public int strStr(String s1, String s2) {
        if (s1.length() < s2.length())
            return -1;
        if (s1.equals(s2))
            return 0;
        for (int i = 0; i+s2.length()-1 < s1.length(); i++) {
            if (s1.charAt(i) == s2.charAt(0)) {
                boolean flag = true;
                for (int j = 0; j < s2.length(); j++) {
                    if (s1.charAt(i+j) != s2.charAt(j)) {
                        flag = false;
                        break;
                    }
                }
                if (flag == true)
                    return (i);
            }
        }
        return -1; 
    }
}

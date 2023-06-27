class Solution {
    public boolean areAlmostEqual(String s1, String s2) {
        if (s1.equals(s2)) return true;
        int one = -100;
        int two = -100;
        for (int i = 0; i < s1.length(); i++)
        {
            if (s1.charAt(i) != s2.charAt(i))
            {
                if (one == -100 && two == -100) {
                    one = s1.charAt(i) - 'a';
                    two = s2.charAt(i) - 'a';
                }
                else
                {
                    one -= s2.charAt(i) - 'a';
                    two -= s1.charAt(i) - 'a';
                }
            }
        }
        return one == 0 && two == 0;
    }
}

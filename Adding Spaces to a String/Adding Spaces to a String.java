class Solution {
    public String addSpaces(String s, int[] spaces) {
        StringBuilder ans = new StringBuilder();
        int j = spaces.length - 1;
        for (int i = s.length() - 1; i >= 0; --i) {
            ans.append(s.charAt(i));
            if (j >= 0 && spaces[j] == i) {
                j--;
                ans.append(' ');
            }
        }
        return ans.reverse().toString(); 
    }
}

class Solution {
    public int appendCharacters(String s, String t) {
        int i = 0;
        int j = 0;
        while(j < t.length() && i < s.length()){
            if(s.charAt(i) == t.charAt(j)){
                i++;
                j++;
            } else i++;
        }
        if(j < t.length()) return t.length()-j;
        else return 0;
    }
}

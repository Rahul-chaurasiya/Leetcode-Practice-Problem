class Solution {
    public boolean isAcronym(List<String> words, String s) {
        if(s.length() != words.size())return false;
        String ans="";
        for(String str : words){
            ans += str.charAt(0);
        }
        return ans.equals(s);
    }
}

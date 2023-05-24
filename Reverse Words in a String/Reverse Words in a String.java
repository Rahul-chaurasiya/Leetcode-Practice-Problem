class Solution {
    public String reverseWords(String str) {
        
        String[] words=str.split("\\s");
        String ans = "";
        for (String s : words) {
            if(s.isBlank()) continue;
            ans = " "+s+ans;
        }

        return ans.substring(1);
    }
}

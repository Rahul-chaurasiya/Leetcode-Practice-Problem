class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        StringBuilder ans = new StringBuilder();
        while(i < word1.length() || i < word2.length()){
            if (i < word1.length()) ans = ans.append(word1.charAt(i));
            if (i < word2.length()) ans = ans.append(word2.charAt(i));
            i++;
        }    
        return ans.toString();
    }
}


==========================================================================================
  

class Solution {
    public String mergeAlternately(String word1, String word2) {
        int i = 0;
        int j = 0;
        StringBuilder ans = new StringBuilder();
        while(i < word1.length() && j < word2.length()){
            ans = ans.append(word1.charAt(i));
            ans = ans.append(word2.charAt(j));
            i++;
            j++;
        }

        while(i < word1.length()){
            ans = ans.append(word1.charAt(i));
            i++;
        }

        while(j < word2.length()){
            ans = ans.append(word2.charAt(j));
            j++;
        }        
        return ans.toString();
    }
}

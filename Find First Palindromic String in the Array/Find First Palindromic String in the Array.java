class Solution {
    public String firstPalindrome(String[] words) {
        for(String word:words){
            if(isPalindrome(word)) return word;
        }
        return "";
    }

    private boolean isPalindrome(String word){
        int high = word.length()-1;
        int low = 0;
        while(low<high){
            if(word.charAt(low)!=word.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
}

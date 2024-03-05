class Solution {
    public int minimumLength(String s) {
        int low = 0;
        int high = s.length()-1;
        while(low<high && s.charAt(low) == s.charAt(high)){
            char ch = s.charAt(low);
            while(low<=high){
                if(s.charAt(low) == ch) low++;
                else break;
            }
            while(low<=high){
                if(s.charAt(high) == ch) high--;
                else break;
            }
        }
        return high-low+1;
    }
}

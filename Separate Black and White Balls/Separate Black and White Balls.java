class Solution {
    public long minimumSteps(String s) {
        long swap = 0;
        int white = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '0') {
                swap += i-white;
                white++;
            }
        }
        return swap;
    }
}

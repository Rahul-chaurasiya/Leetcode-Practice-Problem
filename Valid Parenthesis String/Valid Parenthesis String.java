class Solution {
    public boolean checkValidString(String s) {
        int lmax = 0;
        int lmin = 0;
        for(char ch:s.toCharArray()){
            if(ch == '('){
                lmin++;
                lmax++;
            }else if(ch == ')'){
                lmin--;
                lmax--;
            }else{
                lmin--;
                lmax++;
            }
            if(lmax<0) return false;
            if(lmin<0) lmin=0;
        }
        return lmin == 0;
    }
}

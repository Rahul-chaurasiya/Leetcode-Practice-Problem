class Solution {
    public String maximumOddBinaryNumber(String s) {
        int count_odd = 0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i) == '1')count_odd++;
        }
        
        String ans = "";
        for(int i=0;i<s.length()-1;i++){
            if(count_odd > 1) {
                ans += "1";
                count_odd--;
            }
            else ans += "0";
        }
        
        if(count_odd == 1) ans+="1";
        return ans;
    }
}

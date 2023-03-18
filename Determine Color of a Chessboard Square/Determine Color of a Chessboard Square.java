class Solution {
    public boolean squareIsWhite(String s) {
        int ans=0;
        if(s.charAt(0)=='a') ans=1;
        if(s.charAt(0)=='b') ans=2;
        if(s.charAt(0)=='c') ans=3;
        if(s.charAt(0)=='d') ans=4;
        if(s.charAt(0)=='e') ans=5;
        if(s.charAt(0)=='f') ans=6;
        if(s.charAt(0)=='g') ans=7;
        if(s.charAt(0)=='h') ans=8;

        ans = ans + Integer.parseInt(s, 1, s.length(), 10);
        return ans%2!=0;
    }
}


==============================================================================
    
    
    
class Solution {
    public boolean squareIsWhite(String coordinates) {
        return ((coordinates.charAt(0)-'a')+(coordinates.charAt(1)-'0'))%2==0;
    }
}

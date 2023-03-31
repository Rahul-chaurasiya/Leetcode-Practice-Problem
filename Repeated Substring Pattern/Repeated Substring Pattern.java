class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int n = s.length();
        for(int i=1;i<n/2+1;i++){
            String s1 = s.substring(0,i);
            String s2 = s.substring(i,n);
            if((s2+s1).equals(s)) return true;
        }
        return false;
    }
}

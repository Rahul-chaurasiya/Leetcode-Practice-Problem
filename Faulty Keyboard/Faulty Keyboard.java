class Solution {
    public String finalString(String s) {
        String ans="";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='i') ans = reverse(ans);
            else ans = ans + s.charAt(i);
        }
        return ans;
    }

    public String reverse(String str){
        char[] s = str.toCharArray();
        int n = s.length;
        int halfLength = n / 2;
        for (int i=0; i<halfLength; i++)
        {
            char temp = s[i];
            s[i] = s[n-1-i];
            s[n-1-i] = temp;
        }
        return new String(s);
    }
}

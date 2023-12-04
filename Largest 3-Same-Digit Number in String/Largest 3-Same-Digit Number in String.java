class Solution {
    public String largestGoodInteger(String str) {
        int ans = -1;
        for(int i=0;i<str.length()-2;i++){
            if(str.charAt(i) == str.charAt(i+1) && str.charAt(i+1) == str.charAt(i+2))
                ans = Math.max(ans,str.charAt(i));
        }

        StringBuilder sc = new StringBuilder();
        for(int i=0;i<3;i++)
            sc.append((char)(ans));
        return ans == -1 ? "" : sc.toString();
    }
}

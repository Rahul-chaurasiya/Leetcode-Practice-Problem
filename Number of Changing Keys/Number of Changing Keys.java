class Solution {
    public int countKeyChanges(String s) {
        String s1 = s.toLowerCase(); 
        int p = s1.charAt(0);
        int ans = 0;
        for(char ch:s1.toCharArray()){
            if(ch != p){
                p = ch;
                ans++;
            }
        }
        return ans;
    }
}

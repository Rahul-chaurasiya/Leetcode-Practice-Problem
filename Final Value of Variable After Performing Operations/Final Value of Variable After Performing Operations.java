class Solution {
    public int finalValueAfterOperations(String[] s) {
        int ans=0;
        for(String ch:s){
            if(ch.charAt(1)=='-') ans--;
            else ans++;
        }
        return ans;
    }
}

class Solution {
    public int lengthOfLastWord(String s) {
        int ans=0, n=s.length(), idx=s.length()-1;
        
        while(s.charAt(idx)==' '){
            n--;
            idx--;
        }
        
        for(int i=n-1;i>=0;i--){
            if(s.charAt(i)==' ')break;
            ans++;
        }
        
        return ans;
    }
}

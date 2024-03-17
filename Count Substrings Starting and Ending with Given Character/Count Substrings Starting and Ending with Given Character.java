class Solution {
    public long countSubstrings(String s, char c) {
        long count = 0;
        for(char ch:s.toCharArray()){
            if(ch == c) count++;
        }
        return func(count);
    }
    
    private long func(long x){
        long ans = x*(x+1)/2;
        return ans;
    }
}

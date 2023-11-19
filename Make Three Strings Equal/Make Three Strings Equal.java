class Solution {
    public int findMinimumOperations(String s1, String s2, String s3) {
        int a = s1.length();
        int b = s2.length();
        int c = s3.length();
        int max = Math.min(Math.min(a,b),c);
        int ans = 0;
        int i=0;
        while(i<max){
            if(s1.charAt(i) == s2.charAt(i) && s1.charAt(i) == s3.charAt(i)) i++;
            else{
                break;
            }
        }
        if(i==0) return -1;
        ans = (a-i)+(b-i)+(c-i);
        return ans;
        
    }
}

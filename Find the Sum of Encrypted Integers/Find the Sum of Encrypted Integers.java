class Solution {
    public int sumOfEncryptedInt(int[] nums) {
        int ans = 0;
        for(int x:nums){
            ans += encrypt(x);
        }
        return ans;
    }
    
    private int encrypt(int x){
        String str = Integer.toString(x);
        char maxdigit = '0';
        for(char ch:str.toCharArray()){
            if(maxdigit<ch) maxdigit = ch;
            else continue;
        }
        
        String s = "";
        for (int i = 0; i < str.length(); i++) {
            s+=maxdigit;
        }
        
        return Integer.parseInt(s);
    }
}

class Solution {
    public int longestPalindrome(String s) {
        
        int odd = 0;
        int n = s.length();
        Map<Character, Integer> map = new HashMap<>();

        for (int i = 0; i < n; i++) {
            char ch = s.charAt(i);
            map.put(ch, map.getOrDefault(ch, 0) + 1);
        }   
        for(Object value : map.values()) if((int)value%2 != 0) odd++;
              
        return odd > 0? n - odd + 1: n; 
    }
}


=====================================================================================
  

class Solution {
    public int longestPalindrome(String s) {
        int count[] = new int[128];
        for(char c: s.toCharArray())
            count[c]++;
        boolean flag = true;
        int ans = 0;
        for(int v : count){
            if(v%2==0) ans += v;
            else if(flag == true && (v==1)) {
                ans++;
                flag = false;
            }
            else if(v>1 && v%2 != 0 ){
                ans += v-1;
                if(flag == true){
                    ans++;
                    flag = false;
                }
            }
        }
        return ans;
    }
}

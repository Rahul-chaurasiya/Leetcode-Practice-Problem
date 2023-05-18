
class Solution {
    public int maxVowels(String s, int k) {
        int ans = 0;
        for(int i=0;i<k;i++){
            if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u'){
                ans++;
            }
        }

        boolean prev = false;
        boolean next = false;
        int cur = ans;
        if(ans == s.length()) return ans;
        for(int i=k;i<s.length();i++){
            if(ans == s.length()) return ans;
            if(s.charAt(i-k) == 'a'||s.charAt(i-k) == 'e'||s.charAt(i-k) == 'i'||s.charAt(i-k) == 'o'||s.charAt(i-k) == 'u'){
                prev = true;
            }
            else prev = false;

            if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u'){
                next = true;
            }
            else next = false;

            if(prev == true && next == false) cur--;
            else if(prev == false && next == true){
                cur++;
                ans = Math.max(cur,ans);
            }
        }
        return ans;
    }
}

=============================================================================================================================================================
    
    

class Solution {
    public int maxVowels(String s, int k){
        int[] vowels = new int[256];
        Arrays.fill(vowels,0);
        vowels['a'] = 1;
        vowels['e'] = 1;
        vowels['i'] = 1;
        vowels['o'] = 1;
        vowels['u'] = 1;

        int ans = 0;
        for(int i=0;i<k;i++){
            if(s.charAt(i) == 'a'||s.charAt(i) == 'e'||s.charAt(i) == 'i'||s.charAt(i) == 'o'||s.charAt(i) == 'u'){
                ans++;
            }
        }

        int cur = ans;
        for(int i=k;i<s.length();i++){
            cur += vowels[s.charAt(i)] - vowels[s.charAt(i - k)];
            ans = Math.max(ans, cur);
            if (ans == k) 
                return ans; 
        }
        return ans;
    }
}

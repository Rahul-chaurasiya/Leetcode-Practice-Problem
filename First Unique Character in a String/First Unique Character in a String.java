class Solution {
    public int firstUniqChar(String str) {
        int[] fI = new int[26];
        Arrays.fill(fI, -1);

        for (int i = 0; i < str.length(); i++) {
            if (fI[str.charAt(i)-'a'] == -1)
                fI[str.charAt(i)-'a'] = i;
            else
                fI[str.charAt(i)-'a'] = -2;
        }
        int res = Integer.MAX_VALUE;
        for (int i = 0; i < fI.length; i++) {
            if (fI[i] >= 0)
                res = Math.min(res, fI[i]);
        }
        return (res == Integer.MAX_VALUE) ? -1 : res;
    }
}


==========================================================================
  
  
class Solution {
    public int firstUniqChar(String str) {
        int[] count = new int[26];

        for (int i = 0; i < str.length(); i++) {
            count[str.charAt(i)-'a']++;
        }
        for (int i = 0; i < str.length(); i++) {
            if (count[str.charAt(i)-'a'] == 1)
                return i;
        }
        return -1;
    }
}



============================================================================

class Solution {
     public int firstUniqChar(String s) {
        int ans = Integer.MAX_VALUE;
        for(char c='a'; c<='z';c++){
            int index = s.indexOf(c);
            if(index!=-1&&index==s.lastIndexOf(c)){
                ans = Math.min(ans,index);
            }
        }
        return ans==Integer.MAX_VALUE?-1:ans;
    }   
}

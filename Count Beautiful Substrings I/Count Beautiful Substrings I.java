class Solution {
    public int beautifulSubstrings(String s, int k) {
        int count = 0;
        int n = s.length();
        for(int i=0;i<n;i++){
            int vowel = 0;
            int consonent = 0;
            for(int j=i;j<n;j++){
                char ch = s.charAt(j);

                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') vowel++;
                else consonent++;
                
                if (vowel == consonent && (vowel * consonent) % k == 0) count++;
            }
        }
        return count;
    }
}

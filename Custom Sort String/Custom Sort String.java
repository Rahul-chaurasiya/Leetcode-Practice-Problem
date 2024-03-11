class Solution {
    public String customSortString(String order, String s) {
        int[] arr1 = new int[26];
        for(char ch:order.toCharArray()){
            arr1[ch-'a']++;
        }

        for(char ch:s.toCharArray()){
            arr1[ch-'a']++;
        }

        String ans = "";
        for(char ch : order.toCharArray()){
            if(arr1[ch-'a'] > 1){
                while(arr1[ch-'a']-->1) ans += ch;
            }
            arr1[ch-'a'] = 0;
        }

        for(int i=0;i<26;i++){
            if(arr1[i]>0){
                while(arr1[i]-->0 ) ans += (char)('a' + i);
            }
        }
        return ans;
    }
}

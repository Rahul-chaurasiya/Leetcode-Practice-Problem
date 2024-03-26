class Solution {
    public int maximumLengthSubstring(String s) {
        int n = s.length();
        int max = 0;
        for(int i=0;i<n;i++){
            int arr[] = new int[26];
            for(int j=i;j<n;j++){
                if(arr[s.charAt(j)-'a']++ == 2)break;
                max = Math.max(max,j-i+1);
            }
        }
        return max;
    }
}

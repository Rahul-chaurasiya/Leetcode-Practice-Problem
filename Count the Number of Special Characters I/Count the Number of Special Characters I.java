class Solution {
    public int numberOfSpecialChars(String word) {
        int arr1[] = new int[26];
        int arr2[] = new int[26];
        int count = 0;
        for(char ch:word.toCharArray()){
            if(ch>='a' && ch<='z') arr1[ch-'a']++;
            if(ch>='A' && ch<='Z') arr2[ch-'A']++;
        }

        for(int i=0;i<26;i++){
            if(arr1[i] != 0 && arr2[i] != 0) count++;
        }
        return count;
    }
}

class Solution {
    public int numberOfSpecialChars(String word) {
        int arr1[][] = new int[26][2];
        int arr2[][] = new int[26][2];
        int count = 0;

        for(int i=0;i<26;i++){
            arr2[i][1]=-1;
        }

        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            if(ch>='a' && ch<='z'){
                arr1[ch-'a'][0]++;
                arr1[ch-'a'][1] = i;
            }
            else if(ch>='A' && ch<='Z'){
                arr2[ch-'A'][0]++;
                if(arr2[ch-'A'][1] == -1) arr2[ch-'A'][1] = i;
            }
        }

        for(int i=0;i<26;i++){
            if(arr1[i][0] != 0 && arr2[i][0] != 0 && arr1[i][1] < arr2[i][1]) count++;
        }
        return count;
    }
}

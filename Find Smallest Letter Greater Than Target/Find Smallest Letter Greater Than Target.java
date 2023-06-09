class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        int arr[] = new int[27];
        Arrays.fill(arr, 0);
        for(char ch:letters){
            arr[ch-'a']++;
        }

        for (int i = 0; i < 26; i++) {
            if (arr[i] > 0 && target - 'a' < i) {
                return (char) ((char) 'a' + i);
            }
        }
        return letters[0];

    }
}

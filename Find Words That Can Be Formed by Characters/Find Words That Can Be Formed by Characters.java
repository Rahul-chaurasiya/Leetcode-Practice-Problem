class Solution {
    public int countCharacters(String[] words, String str) {
        int []arr = new int[26];
        int count = 0;
        for(int i=0;i<str.length();i++){
            arr[str.charAt(i)-'a']++;
        }

        for(String s:words){
            int currstr[] = new int[26];
            for(int i=0;i<s.length();i++){
                currstr[s.charAt(i)-'a']++;
            }

            boolean flag = true;
            for(int i=0;i<26;i++){
                if(currstr[i] > arr[i]){
                    flag = false;
                    break;
                }
            }
            if(flag)count += s.length();
        }
        return count;
    }
}

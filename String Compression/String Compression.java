class Solution {
    public int compress(char[] chars) {
        int n = chars.length;
        if(n == 1) return 1;
        int i=0,j=0;
        while(i<n){
            int score = 1;
            while(i<n-1&&chars[i]==chars[i+1]){
                score++;
                i++;
            }
            chars[j++] = chars[i++];
            if(score>1){
                String countStr = Integer.toString(score);
                for (int z=0;z<countStr.length();z++) {
                    chars[j++] = countStr.charAt(z);
                }
            }
        }
        return j;
    }
}

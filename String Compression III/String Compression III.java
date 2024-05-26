class Solution {
    public String compressedString(String word) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<word.length();){
            char ch = word.charAt(i);
            int count = 0;
            while(i<word.length() && word.charAt(i) == ch && count<9){
                    count++;
                    i++;
            }
            sb.append(count);
            sb.append(ch);
            
        }
        return sb.toString();
    }
}

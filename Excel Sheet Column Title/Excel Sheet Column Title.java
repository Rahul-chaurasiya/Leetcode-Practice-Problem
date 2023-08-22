class Solution {
    public String convertToTitle(int cn) {
        StringBuilder s = new StringBuilder();
        while(cn > 0){
            cn--;
            s.append((char)(cn%26+'A'));
            cn /= 26;
        }
        return s.reverse().toString();
    }
}

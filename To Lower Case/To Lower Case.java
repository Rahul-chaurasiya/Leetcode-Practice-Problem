class Solution {
    public String toLowerCase(String str) {
        StringBuilder s = new StringBuilder();
        for(char ch : str.toCharArray()){
            if(ch >= 'A' && ch <= 'Z') ch = (char)(ch+32);
            s.append(ch);
        }
        return s.toString();
    }
}

class Solution {
    public String removeDuplicates(String str) {
        if(str.length() == 1)return str;
        Stack<Character>s = new Stack<>();
        for(char ch : str.toCharArray()){
            if(!s.empty() && s.peek() == ch) s.pop();
            else s.push(ch);
        }

        String ans = "";
        for(char ch:s) ans += ch;
        return ans;
    }
}

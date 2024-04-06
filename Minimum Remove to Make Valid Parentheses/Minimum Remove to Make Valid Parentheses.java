class Solution {
    public String minRemoveToMakeValid(String s) {
        Stack<Character>st = new Stack<>();
        int lc = 0, rc = 0;
        for(char ch:s.toCharArray()){
            if(ch == '(') lc++;
            if(ch == ')') rc++;
            if(rc>lc) rc--;
            else st.push(ch);
        }

        StringBuilder ans = new StringBuilder();
        while(!st.isEmpty()){
            char ch = st.pop();
            if(lc>rc && ch == '(') lc--;
            else ans.append(ch);
        }
        return ans.reverse().toString();
    }
}

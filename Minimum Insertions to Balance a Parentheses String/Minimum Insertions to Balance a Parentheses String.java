class Solution {
    public int minInsertions(String s) {
        Stack<Character> stk = new Stack<>();
        int cnt = 0;
        for(int i = 0; i< s.length(); i++){
            char ch = s.charAt(i); 
            if(ch == ')'){
                if(!stk.isEmpty() && stk.peek() == '(') stk.pop();
                else cnt++;
                if(i+1< s.length() && s.charAt(i+1) == ')') i++;
                else cnt++; 
            }
            else stk.push(ch);
        }
        return stk.size()*2 + cnt;
    }
}

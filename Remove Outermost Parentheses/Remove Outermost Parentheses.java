class Solution {
    public String removeOuterParentheses(String sh) {
        int count=0;
        StringBuilder s=new StringBuilder();
        for(char ch:sh.toCharArray()){
            if(ch=='('){
                count++;
                if(count>1)s.append(ch);
            }else{
                count--;
                if(count!=0)s.append(ch);
            }
        }
        return s.toString();
    }
}


========================================================================================


class Solution {
    public String removeOuterParentheses(String sh) {
        Stack<Character>s=new Stack<>();
        String ans="";
        for(char ch:sh.toCharArray()){
            if(ch=='(')s.push(ch);
            if(s.size()>1)ans+=ch;
            if(ch==')')s.pop();
        }
        return ans;
    }
}

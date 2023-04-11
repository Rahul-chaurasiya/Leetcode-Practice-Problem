class Solution {
    public String removeStars(String s) {
        StringBuilder res = new StringBuilder();
        for (char ch : s.toCharArray()) {
            if(ch == '*')res.setLength(res.length()-1);
            else res.append(ch);
        }
        return res.toString();
    }
}


======================================================================
  
  
class Solution {
    public String removeStars(String s1) {
        Stack<Character> s = new Stack<>();
        for (Character ch : s1.toCharArray()) {
            if (ch == '*') {
                if (s.isEmpty())
                    continue;
                else
                    s.pop();
            } else
                s.push(ch);
        }
        String ans = "";
        for (char ch : s) {
            ans += ch;
        }
        return ans;
    }
}

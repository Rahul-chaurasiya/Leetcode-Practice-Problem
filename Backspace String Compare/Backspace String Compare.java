class Solution {
    public boolean backspaceCompare(String s, String t) {
        StringBuilder sb = new StringBuilder();
        StringBuilder tb = new StringBuilder();
        
        for (char ch : s.toCharArray()) {
            if (ch == '#') {
                if (sb.length() > 0) {
                    sb.deleteCharAt(sb.length() - 1);
                }
            } else {
                sb.append(ch);
            }
        }
        
        for (char ch : t.toCharArray()) {
            if (ch == '#') {
                if (tb.length() > 0) {
                    tb.deleteCharAt(tb.length() - 1);
                }
            } else {
                tb.append(ch);
            }
        }
        
        return sb.toString().equals(tb.toString());
    }
}

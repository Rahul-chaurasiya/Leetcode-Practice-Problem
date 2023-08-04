class Solution {
    public boolean isNumber(String s) {
        boolean digit = false;
        boolean dot = false;
        boolean e = false;
        boolean aftere = false;

        s = s.trim();

        for(int i = 0; i < s.length(); i++){
            char c = s.charAt(i);
            if(c == '+' || c == '-'){
                if(i != 0 && s.charAt(i - 1) != 'E' && s.charAt(i - 1) != 'e') return false;
            }
            else if(Character.isDigit(c)){
                digit = true;
                aftere = false;
            }
            else if(c == '.'){
                if(dot || e)return false;
                dot = true;
            }
            else if(c == 'E' || c == 'e'){
                if(e || !digit) return false;
                e = true;
                aftere = true;
            }
            else return false;
        }

        return !aftere && digit;
    }
}

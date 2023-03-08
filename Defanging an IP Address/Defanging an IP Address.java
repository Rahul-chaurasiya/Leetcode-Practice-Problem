class Solution {
    public String defangIPaddr(String address) {
        StringBuilder sb = new StringBuilder();
        for (char c : address.toCharArray()) {
            if (c != '.')
                sb.append(c);
            else
                sb.append("[.]");
        }
        return sb.toString();
    }
}


======================================================================
  
  
class Solution {
    public String defangIPaddr(String s) {
        String ans = "";
        for(char c : s.toCharArray()){
            if(c == '.'){
                ans += "[.]";
            }
            else{
                ans += c;
            }
        }
        return ans;
    }
}


======================================================================

  
class Solution {
    public String defangIPaddr(String s) {
        int n = s.length();
        String ans = "";
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='.'){
                ans += "[.]";
            }
            else{
                char c = s.charAt(i);
                ans += c;
            }
        }
        return ans;
    }
}

class Solution {
    public boolean isSubstringPresent(String s) {
        int count = 0;
        for(int i=0;i<s.length()-1;i++){
            String sub = s.substring(i, i + 2);
            if(s.contains(func(sub))) return true;
        }
        
        return false;
    }
    
    private String func(String s){
        StringBuilder reversed = new StringBuilder();
        for (int i = s.length() - 1; i >= 0; i--) {
            reversed.append(s.charAt(i));
        }
        return reversed.toString();
    }
}

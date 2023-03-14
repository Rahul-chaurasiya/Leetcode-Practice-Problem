class Solution {
    public boolean isPalindrome(String s) {
        String str = "";
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)>='a'&&s.charAt(i)<='z' || s.charAt(i)>='A'&&s.charAt(i)<='Z' || s.charAt(i)>=48&&s.charAt(i)<=57){
                str += s.charAt(i);
            }
        }

        String st = str.toLowerCase();
        int low = 0;
        int high = st.length()-1;
        while(low<high){
            if(st.charAt(low) != st.charAt(high)) return false;
            low++;
            high--;
        }
        return true;
    }
}

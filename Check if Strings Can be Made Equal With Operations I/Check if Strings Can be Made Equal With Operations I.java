class Solution {
    public boolean canBeEqual(String s1, String s2) {
        String str10 = String.valueOf(s1.charAt(0)) + String.valueOf(s1.charAt(2));
        String str12 = String.valueOf(s1.charAt(2)) + String.valueOf(s1.charAt(0));
        String str20 = String.valueOf(s2.charAt(0)) + String.valueOf(s2.charAt(2));
        String str22 = String.valueOf(s2.charAt(2)) + String.valueOf(s2.charAt(0));

        String str11 = String.valueOf(s1.charAt(1)) + String.valueOf(s1.charAt(3));
        String str13 = String.valueOf(s1.charAt(3)) + String.valueOf(s1.charAt(1));
        String str21 = String.valueOf(s2.charAt(1)) + String.valueOf(s2.charAt(3));
        String str23 = String.valueOf(s2.charAt(3)) + String.valueOf(s2.charAt(1));
        
        if((str10.equals(str20) || str10.equals(str22) || str12.equals(str20) || str12.equals(str22)) && (str11.equals(str21) || str11.equals(str23) || str13.equals(str23) || str13.equals(str23))){
            return true;
        }else return false;
    }
}

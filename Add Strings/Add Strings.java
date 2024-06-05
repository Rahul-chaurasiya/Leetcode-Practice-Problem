class Solution {
    public String addStrings(String nums1, String nums2) {
        StringBuilder sb = new StringBuilder();
        int i = nums1.length()-1;
        int j = nums2.length()-1;
        int carry = 0;
        while(i>=0 || j>=0 || carry !=0){
            int sum = 0;
            if(i>=0){
                sum += (nums1.charAt(i)-'0');
                i--;
            }
            if(j>=0){
                sum += (nums2.charAt(j)-'0');
                j--;
            }

            sum += carry;
            carry = sum/10;
            sb.append(sum%10);
        }
        return sb.reverse().toString();
    }
}

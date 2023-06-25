class Solution {
    public int countBeautifulPairs(int[] nums) {
       int ans2 = 0;
    int len3 = nums.length;
    for (int i = 0; i < len3 - 1; i++) {
        String first = Integer.toString(nums[i]);
        int left = Character.getNumericValue(first.charAt(0));
        for (int j = i + 1; j < len3; j++) {
            String last = Integer.toString(nums[j]);
            int lastval = Character.getNumericValue(last.charAt(last.length() - 1));
            int gcdval = gcd(left, lastval);
            if (gcdval == 1) {
                ans2++;
            }
        }
    }
    return ans2;
    }
    
    
    public int gcd(int a, int b) {
        int i = a<b?a:b;
        for(i=i;i>1;i--){
            if(a%i == 0 && b%i == 0) return i;
        }
        return 1;
    }
}

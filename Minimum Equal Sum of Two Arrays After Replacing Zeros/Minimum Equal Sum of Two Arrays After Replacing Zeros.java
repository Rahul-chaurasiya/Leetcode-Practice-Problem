class Solution {
    public long minSum(int[] nums1, int[] nums2) {
        long sum1 = 0, c1 = 0;
        long sum2 = 0, c2 = 0;
        
        for(int x : nums1) {
            sum1 += x;
            if(x==0)c1++;
        }
        
        for(int x : nums2){
            sum2 += x;
            if(x==0)c2++;

        }
        
        if(sum1 == sum2 && c1 == 0 && c2 == 0) return sum2;
        if(c1 == 0 && sum2+c2>sum1 || c2 == 0 && sum1+c1>sum2) return -1;
        return Math.max(sum1+c1,sum2+c2);
    }
}

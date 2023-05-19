class Solution {
    public int numSubseq(int[] nums, int target) {
        Arrays.sort(nums);
        int l = 0;
        int r = nums.length;
        int ans = 0;
        int pow[] = new int[r];
        pow[0] = 1;
        for(int i=1;i<r;i++){
            pow[i] = (pow[i-1]*2) % 1000000007;
        }

        r--;
        while(l <= r){
            if((nums[l] + nums[r]) <= target){
                ans += pow[r-l];
                ans %= 1000000007;
                l++;
            }
            else r--;
        }
        return ans;
    }
}

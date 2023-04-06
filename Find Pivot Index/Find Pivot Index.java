class Solution {
    public int pivotIndex(int[] nums) {
        int n = nums.length;
        int lmax[] = new int[n];
        int rmax[] = new int[n];

        int sum = 0;
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            lmax[i] = sum;
        }

        sum = 0;
        for (int i = n - 1; i >= 0; i--) {
            sum += nums[i];
            rmax[i] = sum;
        }

        for(int i = 0; i < n; i++){
            if(lmax[i] == rmax[i]) return i;
        }

        return -1;
    }
}

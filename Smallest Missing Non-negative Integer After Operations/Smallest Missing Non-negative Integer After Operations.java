class Solution {
    public int findSmallestInteger(int[] nums, int value) {
        for (int i = 0; i < nums.length; i++) {
            int n = nums[i];
            int mod = n % value;
            if (mod < 0) mod += value;
            nums[i] = mod;
        }

        Arrays.sort(nums);
        int mem = -1, count = 0;
        for (int i = 0; i < nums.length; i++) {
            int curr = nums[i];
            if (curr != mem) {
                count = 0;
                mem = curr;
            } else {
                count++;
            }
            nums[i] = curr + count * value;
        }

        Arrays.sort(nums);
        
        count = 0;
        for (int n : nums) if (n != count++) return count - 1;
        return count;
    }
}

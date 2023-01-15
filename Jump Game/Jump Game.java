class Solution {
    public boolean canJump(int[] nums) {
        int ptr = nums.length - 1;
        int count = 0;
        for (int i = nums.length - 2; i >= 0; i--) {
            if (nums[i] >= ptr - i) {
                ptr = i;
                count = count + 1;
            }

        }
        if (ptr != 0)
            return false;
        else
            return true;
    }

}

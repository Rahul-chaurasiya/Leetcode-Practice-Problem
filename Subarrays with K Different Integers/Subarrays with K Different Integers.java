import java.util.HashMap;

class Solution {
    protected int solve(int[] nums, int k) {
        int n = nums.length;
        int ans = 0;
        HashMap<Integer, Integer> mpp = new HashMap<>();
        int j = 0, i = 0;
        while (j < n) {
            mpp.put(nums[j], mpp.getOrDefault(nums[j], 0) + 1);
            while (mpp.size() > k) {
                mpp.put(nums[i], mpp.get(nums[i]) - 1);
                if (mpp.get(nums[i]) == 0) mpp.remove(nums[i]);
                i++;
            }
            ans += j - i + 1;
            j++;
        }
        return ans;
    }

    public int subarraysWithKDistinct(int[] nums, int k) {
        return solve(nums, k) - solve(nums, k - 1);
    }
}

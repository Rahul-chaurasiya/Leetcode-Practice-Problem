class Solution {
    public int maxSubarraySumCircular(int[] nums) {
        int max_normal = normalMaxSum(nums, nums.length);
    	if(max_normal < 0)
    		return max_normal;

    	int arr_sum = 0;
    	for(int i = 0; i < nums.length; i++){
    		arr_sum += nums[i];
    		nums[i] = -nums[i];
    	}
    	int max_circular = arr_sum + normalMaxSum(nums, nums.length);
    	return Math.max(max_circular, max_normal);
    }

    static int normalMaxSum(int arr[], int n)
    {
    	int res = arr[0];
    	int maxEnding = arr[0];

    	for(int i = 1; i < n; i++){
    		maxEnding = Math.max(maxEnding + arr[i], arr[i]);
    		res = Math.max(maxEnding, res);
    	}
    	return res;
    }
}

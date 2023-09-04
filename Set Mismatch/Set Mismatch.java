class Solution {
    public int[] findErrorNums(int[] nums) {
        int ans[] = {-1,-1};
        int arr[] = new int[nums.length+1];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
            if(arr[nums[i]] == 2) ans[0] = nums[i];
        }

        for(int i=1;i<=nums.length;i++){
            if(arr[i] == 0) ans[1] = i;
        }

        return ans;
    }
}

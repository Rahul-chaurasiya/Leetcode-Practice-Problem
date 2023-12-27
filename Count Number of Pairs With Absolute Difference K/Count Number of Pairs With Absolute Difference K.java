class Solution {
    public int countKDifference(int[] nums, int k) {
        int count = 0;
        int l = nums.length;
        for(int i=0;i<l;i++){
            for(int j=i;j<l;j++){
                if(Math.abs(nums[i]-nums[j]) == k) count++;
            }
        }
        return count;
    }
}

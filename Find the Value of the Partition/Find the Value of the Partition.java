class Solution {
    public int findValueOfPartition(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        int min=-1;
        for (int i = 0; i < n-1; i++) {
            int diff = nums[i+1]-nums[i];
            if(min==-1){
                min=diff;
            }else{
                if(diff<min){
                    min=diff;
                }
            }
        }
        return min;
    }
}

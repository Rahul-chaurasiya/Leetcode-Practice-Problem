class Solution {
    public int[] findIndices(int[] nums, int id, int vd) {
        
        int []ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        
        int max = nums[0],min = nums[0];
        int index1 = 0,index2 = 0;
        
        for (int i = id; i < nums.length; i++) {
        
            if (nums[i - id] > max) {
                max = nums[i - id];
                index1 = i - id;
            }
            
            if (nums[i - id] < min) {
                min = nums[i - id];
                index2 = i - id;
            }
            
            if (Math.abs(nums[i] - max) >= vd){
                ans[0] = index1;
                ans[1] = i;
                return ans;
            }
            
            if (Math.abs(nums[i] - min) >= vd){
                ans[0] = index2;
                ans[1] = i;
                return ans;
            }
    
        }
        return ans;
    }
}

class Solution {
    public int minimumSum(int[] nums) {
        int left[] = new int[nums.length];
        int right[] = new int[nums.length];
        int ans = Integer.MAX_VALUE;
        
        Arrays.fill(left,99);
        Arrays.fill(right,99);
        
        left[0] = nums[0];
        for(int i=1;i<nums.length;i++) 
            left[i] = Math.min(left[i-1],nums[i]);
        
        right[nums.length-1] = nums[nums.length-1];
        for(int i=nums.length-2;i>=0;i--) 
            right[i] = Math.min(right[i+1],nums[i]);
        
        for(int i=1;i<nums.length-1;i++) 
            if(left[i-1] <nums[i] && right[i+1]<nums[i]) 
                ans = Math.min(ans,left[i-1]+right[i+1]+nums[i]);
        
        if(ans==Integer.MAX_VALUE) return -1;
        else return ans;
    }
}

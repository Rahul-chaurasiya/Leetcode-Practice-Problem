class Solution {
    public int[][] divideArray(int[] nums, int k) {
        int ans[][] = new int[0][0];
        Arrays.sort(nums);
        for(int i=0;i<nums.length-2;i+=3){
            if(nums[i+2]-nums[i]<=k){
                int temp[] = {nums[i],nums[i+1],nums[i+2]};
                ans = Arrays.copyOf(ans,ans.length+1);
                ans[ans.length-1] = temp;
            }else {
                return new int[0][0];
            }
        }
        return ans;
    }
}

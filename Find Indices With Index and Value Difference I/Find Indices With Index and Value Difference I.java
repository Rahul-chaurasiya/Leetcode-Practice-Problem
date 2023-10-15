class Solution {
    public int[] findIndices(int[] nums, int id, int vd) {
        int []ans = new int[2];
        ans[0] = -1;
        ans[1] = -1;
        for(int i=0;i<nums.length-id;i++){
            for(int j=i+id;j<nums.length;j++){
                if(Math.abs(nums[i]-nums[j]) >= vd){
                    ans[0] = i;
                    ans[1] = j;
                }
            }
        }
        return ans;
    }
}

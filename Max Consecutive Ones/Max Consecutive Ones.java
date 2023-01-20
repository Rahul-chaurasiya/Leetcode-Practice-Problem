class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max=0,x=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                max++;
                x=Math.max(x,max);
            }
            
            else{
                x=Math.max(x,max);
                max=0;
            }
        }
        return x;
    }
}

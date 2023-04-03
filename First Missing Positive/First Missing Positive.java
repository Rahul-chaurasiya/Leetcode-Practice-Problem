class Solution {
    public int firstMissingPositive(int[] nums) {
        Arrays.sort(nums);
        int count = 1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                if(i>0) if(nums[i]==nums[i-1]) continue;
                if(nums[i] != count) {
                    return count;
                }
                count++;
            }
        }
        return nums[nums.length-1]<=0?1:nums[nums.length-1]+1;
    }
}




==================================================================================
  
  
  
class Solution {
    public int firstMissingPositive(int[] nums) {
        int i, flag = 0, out = 0;
        Arrays.sort(nums);
        for (i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                flag = 1;
                break;
            }
        }
        if (flag == 0)
            return 1;
        else {
            for (i = 0; i < nums.length - 1; i++) {
                if (nums[i] > 0) {
                    if (nums[i + 1] == nums[i] + 1) continue;
                    else if (nums[i] == nums[i + 1]) continue;
                    else return nums[i] + 1;
                }
            }
        }
        return nums[i] + 1;
    }
}

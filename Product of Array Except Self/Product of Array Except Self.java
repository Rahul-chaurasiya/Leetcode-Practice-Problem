

class Solution {
    public int[] productExceptSelf(int[] nums) {
        int x=0,count=0;

        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0)
            {
                x=1;
                break;
            }
        }

        if(x==0){
            for(int i=0;i<nums.length;i++)
                nums[i] = 0;
            return nums;
        }

        for(int i=0;i<nums.length;i++){
            if(nums[i] != 0)
                x = x*nums[i];
            else count++;
        }

        if(count == 1){
            for(int i=0;i<nums.length;i++){
                if(nums[i] != 0) nums[i] = 0;
                else nums[i] = x;
            }
            return nums;
        }

        if(count != 0 && count != 1){
            for(int i=0;i<nums.length;i++)
                nums[i] = 0;
            return nums;
        }

        for(int i=0;i<nums.length;i++){
            nums[i] = x/nums[i];
        }
        return nums;
    }
}

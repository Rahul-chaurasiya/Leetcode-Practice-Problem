class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        if(nums.length==1) return nums[0];
        if(nums[0]!=nums[1]) return nums[0];
        if(nums[nums.length-1]!=nums[nums.length-2]) return nums[nums.length-1];
        int count=1;
        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i - 1])
                count++;
            if (nums[i] != nums[i - 1] ){
                if(count != 3) return nums[i-1];
                count=1;
            }
        }
        return 0;
    }
}



=====================================================================================================


class Solution {
    public int singleNumber(int[] nums) {
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 1; i=i+3) {
            if (nums[i] == nums[i + 1])
                continue;
            else return nums[i];
        }
        return nums[nums.length - 1];
    }
}

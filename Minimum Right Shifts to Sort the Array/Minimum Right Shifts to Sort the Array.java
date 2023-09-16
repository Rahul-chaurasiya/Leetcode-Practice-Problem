class Solution {
    public int minimumRightShifts(List<Integer> nums) {
        if(nums.size() == 1) return 0;
        else return function(nums);
    }
    
    public int function(List<Integer>nums){
        int x = 0;
        int y = 0;
        for(int i=0;i<nums.size()-1;i++){
            int k = nums.get(i+1);
            if(k < nums.get(i)) y++;
            else if(y == 0)x++;
        }
        
        if(nums.get(nums.size()-1) > nums.get(0)) y++;
        if(y > 1) return -1;
        if(y == 1) return nums.size()-x-1;
        
        return 0;
    }
}

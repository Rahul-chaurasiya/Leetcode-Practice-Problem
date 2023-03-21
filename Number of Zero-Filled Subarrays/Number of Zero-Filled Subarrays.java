class Solution {
    public long zeroFilledSubarray(int[] nums) {
        int x=0;
        long sum=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] == 0) sum += ++x;
            else x=0;
        }
        return sum;
    }
}

=======================================================================
    
class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long x=0;
        long sum=0;
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(nums[i] == 0) x++;
            else if(nums[i]!=0){
                sum += ((x*(x+1))/2);
                x=0;
            }
        }
        sum += ((x*(x+1))/2);
        return sum;
    }
}

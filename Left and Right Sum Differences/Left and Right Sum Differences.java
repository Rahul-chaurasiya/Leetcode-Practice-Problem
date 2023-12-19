class Solution {
    public int[] leftRightDifference(int[] nums) {
        int[] sum=new int[nums.length];
        int leftsum,rightsum;
        leftsum=rightsum=0;

        //calulate total sum
        int totalsum=0;
        for(int num:nums){
            totalsum+=num;
        }

        for(int i=0;i<nums.length;i++){
           leftsum=rightsum=0;
            int num=nums[i];

            //calculate leftsum
                if(i==0) leftsum=0;
                else{
                    for(int j=0;j<i;j++) leftsum+=nums[j];
                }
             //calculate rightsum
             rightsum=totalsum-leftsum-num;

            sum[i]=Math.abs(leftsum-rightsum);
        }
        return sum;
    }
}

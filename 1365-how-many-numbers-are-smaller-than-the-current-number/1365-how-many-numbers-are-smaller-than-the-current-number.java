class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int count=0,l=nums.length;
        int ans[] = new int [l];
        for(int i=0;i<l;i++)
        {
            count = 0;
            for(int j=0;j<l;j++)
            {
                if(nums[i]>nums[j])
                {
                    count++;
                }
                
            }
            ans[i]=count;
        }
        return ans;
    }
}
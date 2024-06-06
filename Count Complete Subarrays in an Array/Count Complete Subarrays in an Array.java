class Solution {
    public int countCompleteSubarrays(int[] nums) {
        HashSet<Integer>hs = new HashSet<>();
        int count = 0;
        for(int num:nums){
            hs.add(num);
        }

        for(int i=0;i<nums.length;i++){
            HashSet<Integer>h=new HashSet<>();
            for(int j=i;j<nums.length;j++){
                h.add(nums[j]);
                if(hs.size() == h.size()) count++;
            }
        }
        return count;
    }
}

class Solution {
    public int maxSubarrayLength(int[] nums, int k) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        int ans = 0;
        int j=0;
        
        for(int i=0;i<nums.length;i++){
            hm.put(nums[i],hm.getOrDefault(nums[i],0)+1);
            if (hm.get(nums[i]) > k){
                while(j<i&&hm.get(nums[i])>k){
                    if(hm.get(nums[j]) == 1) hm.remove(nums[j]);
                    else hm.put(nums[j],hm.get(nums[j])-1);
                    j++;
                }
            }
            ans = Math.max(ans,i-j+1);
        }
        return ans;
    }
}

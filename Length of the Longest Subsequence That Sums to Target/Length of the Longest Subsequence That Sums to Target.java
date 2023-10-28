class Solution {
    public int lengthOfLongestSubsequence(List<Integer> nums, int target) {
        int ans[] = new int[target+1];
        Arrays.fill(ans, -1);
        ans[0] = 0;
        for(int i=0;i<nums.size();i++)
            for(int j=target;j>=nums.get(i);j--) if(ans[j-nums.get(i)] != -1) ans[j] = Math.max(ans[j],ans[j-nums.get(i)]+1);

        if(ans[target] != -1) return ans[target];
        else return -1;
    }
}



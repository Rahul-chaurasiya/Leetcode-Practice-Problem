class Solution {
    public int constrainedSubsetSum(int[] nums, int k) {
        ArrayDeque<Integer>ad = new ArrayDeque<>();
        int sum[] = new int[nums.length];
        int res = nums[0];
        for(int i=0;i<nums.length;i++){
            sum[i] = nums[i];
            if(!ad.isEmpty()) sum[i]+=sum[ad.peekFirst()];
            
            res = Math.max(res,sum[i]);

            if(!ad.isEmpty() && i-ad.peekFirst() >= k) ad.pollFirst();
            while(!ad.isEmpty() && sum[i] > sum[ad.peekLast()]) ad.pollLast();
            
            if(sum[i] >0) ad.offerLast(i);
        }

        return res;
    }
}
class Solution {
    public int maximumScore(int[] nums, int k) {
        int n = nums.length;
        int left[] = new int[n];
        int right[] = new int[n];
        Stack<Integer>sl = new Stack<>();
        Stack<Integer>sr = new Stack<>();

        for(int i=0;i<n;i++){
            left[i] = -1;
            right[i] = n;
        }

        for(int i=n-1;i>=0;i--){
            while(!sl.isEmpty() && nums[sl.peek()]>nums[i]) left[sl.pop()] = i;
            sl.push(i);
        }

        for(int i=0;i<n;i++){
            while(!sr.isEmpty() && nums[sr.peek()]>nums[i]) right[sr.pop()] = i;
            sr.push(i);
        }

        int ans = 0;
        for(int i=0;i<n;i++){
            if(left[i]<k && right[i]>k){
                int max = nums[i]*(right[i]-left[i]-1);
                ans = Math.max(ans,max);
            }
        }

        return ans;
    }
}
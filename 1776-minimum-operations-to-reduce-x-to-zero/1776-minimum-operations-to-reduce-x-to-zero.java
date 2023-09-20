class Solution {
    public int minOperations(int[] nums, int x) {
        int n = nums.length;
        int sum = 0;
        HashMap<Integer, Integer> mp = new HashMap<>();
        
        for (int i = 0; i < n; i++) {
            sum += nums[i];
            mp.put(sum, i);
        }
        mp.put(0, 0); 
        
        if (x > sum) return -1;
        if (x == sum) return n; 
        
        int longsubarray = 0;
        sum -= x;
        int val = 0;

        for (int i = 0; i < n; ++i) {
            val += nums[i];
            if (mp.containsKey(val - sum)) {
                if (val - sum == 0) {
                    longsubarray = Math.max(longsubarray, i - mp.get(val - sum) + 1);
                } else {
                    longsubarray = Math.max(longsubarray, i - mp.get(val - sum));
                }
            }
        }

        return longsubarray == 0 ? (sum == 0 ? n : -1) : n - longsubarray;
    }
}

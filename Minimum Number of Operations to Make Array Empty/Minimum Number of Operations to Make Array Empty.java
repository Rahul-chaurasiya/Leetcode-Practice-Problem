class Solution {
    public int minOperations(int[] nums) {
        
        HashMap<Integer, Integer> hm = new HashMap<>();
        int ans = 0;
        for (int num : nums) hm.put(num, hm.getOrDefault(num, 0) + 1);
        
        for(int x : hm.values()){
            if(x%3 == 0) ans += x/3;
            else{
                int num = x%3;
                if(x == 1) return -1;
                ans += (x/3)+1;
            }
        }
        return ans;
    }
}

class Solution {
    public int maxFrequencyElements(int[] nums) {
        int arr[] = new int[101];
        int max = 0;
        for(int x : nums){
            arr[x]++;
            max = Math.max(max,arr[x]);
        }
        
        int ans = 0;
        for(int x:arr){
            if(x == max) ans += max;
        }
        
        return ans;
    }
}

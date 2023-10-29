class Solution {
    public int findKOr(int[] nums, int k) {
        int arr[] = new int[32];
        for(int i=0;i<31;i++){
            for(int j=0;j<nums.length;j++){
                if(((1<<i) & nums[j]) != 0) arr[i]++;
            }
        }
        
        return function(arr,k);
    }
    
    public int function(int []arr,int k){
        int ans = 0;
        for(int i=0;i<31;i++)
            if(arr[i] >= k) ans = ans | (1 << i);
        return ans;
    }
}

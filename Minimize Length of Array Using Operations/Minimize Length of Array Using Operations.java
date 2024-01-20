class Solution {
    public int minimumArrayLength(int[] nums) {
        Arrays.sort(nums);
        if(nums.length >= 3 && nums[0] != nums[1]) 
            return 1;
        
        int final_gcd = nums[0];
        for(int i=0;i<nums.length;i++){
            final_gcd = GCD(final_gcd,nums[i]);
        }
        
        int ans = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == final_gcd) 
                ans++;
        }
        
        return Math.max(1,(ans+1)/2);         
    }
    
    public int GCD(int a, int b) {
        while (a != b) {
            if (a > b)
                a = a - b;
            else
                b = b - a;
        }
        return a;
    }
}

class Solution {
    public int maximumPrimeDifference(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(isPrime(nums[i])) nums[i] = 1;
            else nums[i] = 0;
        }

        int start = nums.length+1;
        int end = -1;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1){
                start = Math.min(start,i);
                end = Math.max(end,i);
            }
        }

        if(start < nums.length+1 && end != -1) return end - start;
        else return 0;
    }

    private boolean isPrime(int x){
        if(x==1) return false;
        if(x==2 || x==3) return true;
        if(x%2==0 || x%3 == 0) return false;
        
        for(int i=5; i*i<=x ; i=i+6){           
            if(x%i == 0 || x%(i+2) == 0) return false;    
        }                                                      
        return true;
    }
}

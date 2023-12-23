class Solution {
    public int incremovableSubarrayCount(int[] nums) {
        int count = 0;
        for(int i=0;i<nums.length;i++){
            for(int j=i;j<nums.length;j++){
                
                int len = i + (nums.length-1-j);
                int[] arr = new int[len];
                int idx = 0;

                for (int k=0;k<i;k++) arr[idx++] = nums[k];
                for (int k=j+1; k<nums.length; k++) arr[idx++] = nums[k];

                if(istrue(arr)) count++;
            }
        }
        
        return count;
    }
    
    public boolean istrue(int[] arr) {
        for (int i=1;i<arr.length;i++) {
            if (arr[i] <= arr[i - 1]) return false;
        }
        return true;
    }
}

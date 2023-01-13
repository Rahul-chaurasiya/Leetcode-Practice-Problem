class Solution {
    public int[] rearrangeArray(int[] nums) {
        int arr[] = new int [nums.length];
        int even=0,odd=1;
        for(int i : nums){
            if(i > 0){
                arr[even] = i;
                even += 2;
            }
            else if(i < 0){
                arr[odd] = i;
                odd += 2;
            }
        }
        return arr;
    }
}

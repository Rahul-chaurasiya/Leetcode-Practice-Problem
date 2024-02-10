class Solution {
    public int[] numberOfPairs(int[] nums) {
        int count1 = 0;
        int count2 = 0;
        int arr[] = new int[101];
        for(int i=0;i<nums.length;i++){
            arr[nums[i]]++;
            if(arr[nums[i]] == 2){
                count1++;
                arr[nums[i]] = 0;
            }
        }

        for(int i=0;i<101;i++){
            if(arr[i] > 0) count2++;
        }

        return new int[] {count1,count2};
    }
}

class Solution {
    public int findDuplicate(int[] nums) {
        int arr[] = new int[nums.length];
        for(int x : nums){
            arr[x]++;
            if(arr[x] == 2) return x;
        }
        return 0;
    }
}

class Solution {
    public int[] answerQueries(int[] nums, int[] queries) {
        Arrays.sort(nums);
        int arr[] = new int[queries.length];
        for(int i=0;i<queries.length;i++){
            int q = queries[i];
            int count = 0;
            int sum = 0;
            for(int j=0;j<nums.length;j++){
                sum += nums[j];
                if(sum > q) break;
                count++;
            }
            arr[i] = count;
        }
        return arr;
    }
}

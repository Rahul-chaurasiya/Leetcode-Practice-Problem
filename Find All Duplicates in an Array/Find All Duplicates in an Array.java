class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer>list = new ArrayList<>();
        int arr[] = new int[nums.length+1];
        for(int x : nums){
            arr[x]++;
            if(arr[x] == 2) list.add(x);
        }
        return list;
    }
}

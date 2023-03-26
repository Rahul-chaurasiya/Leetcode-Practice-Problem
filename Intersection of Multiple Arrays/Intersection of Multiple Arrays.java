class Solution {
    public List<Integer> intersection(int[][] nums) {
        List<Integer> l = new ArrayList<>();
        int arr[] = new int[1001];
        int n = nums.length;
        for(int i=0;i<n;i++){
            int x = nums[i].length;
            for(int j=0;j<x;j++){
                arr[nums[i][j]]++;
                if(arr[nums[i][j]] >= n){
                    l.add(nums[i][j]);
                }
            }
        }
        Collections.sort(l);
        return l;
    }
}

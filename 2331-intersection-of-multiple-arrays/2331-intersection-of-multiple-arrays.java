class Solution {
    public List<Integer> intersection(int[][] nums) {
        int arr[] = new int[1001];
        List<Integer>l=new ArrayList<>();
        for(int i=0;i<nums.length;i++) for(int j=0;j<nums[i].length;j++) arr[nums[i][j]]++; 
        for(int i=0;i<arr.length;i++) if(arr[i] == nums.length) l.add(i);
        return l;
    }
}
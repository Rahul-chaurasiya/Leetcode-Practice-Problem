class Solution {
    public int countWays(List<Integer> nums) {
        int n= nums.size();
        int ways = 0;
        Collections.sort(nums);
        if(nums.get(0) != 0)ways++;
        for(int i=0;i<nums.size();i++){
            int s = i+1;
            if(i == n-1){
                if(s > nums.get(i)) ways++;
            }else if(i < n-1){
                if(s > nums.get(i) && s < nums.get(i + 1)) ways++;
            }
        }
        return ways;
    }
}

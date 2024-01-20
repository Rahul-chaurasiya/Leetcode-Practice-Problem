class Solution {
    public int minimumCost(int[] nums) {
        List<Integer>l = new ArrayList<>();
        for(int x:nums) l.add(x);
        Collections.sort(l);
        int num1 = l.get(0);
        int num2 = l.get(1);
        int num3 = l.get(2);
        if(nums[0] == num1) return nums[0]+num2+num3;
        else if(nums[0] == num2) return nums[0]+num1+num3;
        else if(nums[0] == num3) return nums[0]+num2+num1;
        return nums[0]+num2+num1;
    }
}

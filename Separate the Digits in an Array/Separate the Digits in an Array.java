class Solution {
    public int[] separateDigits(int[] nums) {
        List<Integer> al = new ArrayList<Integer>();
        for(int i=nums.length-1;i>=0;i--){
            while(nums[i] != 0){
                int rem = nums[i]%10;
                nums[i] = nums[i]/10;
                al.add(0,rem);
            }
        }
        
        int [] arr = new int[al.size()];
        for (int i = 0; i < al.size(); i++)
            arr[i] = al.get(i);
        return arr;
    }
}

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        List<Integer>even = new ArrayList<>();
        List<Integer>odd = new ArrayList<>();
        for(int x:nums){
            if(x%2 == 0)even.add(x);
            else odd.add(x);
        }

        for(int i=0;i<nums.length;i++){
            if(even.size()>0){
                nums[i] = even.get(0);
                even.remove(0);
            }else{
                nums[i] = odd.get(0);
                odd.remove(0);
            }
        }

        return nums;
    }
}

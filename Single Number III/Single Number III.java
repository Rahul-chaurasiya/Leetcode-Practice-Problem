class Solution {
    public int[] singleNumber(int[] nums) {
        int arr[] = {0,0};
        Arrays.sort(nums);
        int j=0;
        for(int i=0;i<nums.length-1;i++){
            boolean flag = true;
            if(flag == true && nums[i] == nums[i+1]){
                flag = false;
                i++;
            }
            if(flag == true){
                arr[j++]=nums[i];
            }

            if(nums[nums.length-2] != nums[nums.length-1])
                arr[j]=nums[nums.length-1];
        }
        return arr;
    }
}


===========================================================================================
  
  
class Solution {
    public int[] singleNumber(int[] nums) {
        int arr[] = {0,0};
        LinkedHashMap<Integer, Integer> m = new LinkedHashMap<Integer, Integer>();

        for (int i = 0; i < nums.length; i++) {
            m.put(nums[i], m.getOrDefault(nums[i], 0) + 1);
        }

        for(int i=0;i<nums.length;i++){
            if(m.get(nums[i]) == 1){
                arr[1] = arr[0];
                arr[0] = nums[i];
            }
        }
        return arr;
    }
}

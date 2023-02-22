

class Solution {
    public void sortColors(int[] nums) {
        int arr[] = new int [nums.length+1];
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 0) arr[count++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 1) arr[count++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            if(nums[i] == 2) arr[count++]=nums[i];
        }
        for(int i=0;i<nums.length;i++){
            nums[i] = arr[i];
        }
    }
}



=======================================================================
    

class Solution {
    public void sortColors(int[] nums) {
        int[] colors = new int[3];
        for (int i = 0; i < nums.length; i++)
            colors[nums[i]] = colors[nums[i]] + 1;

        int index = 0;
        for (int i = 0; i < colors.length; i++) {
            for (int j = 0; j < colors[i]; j++)
                nums[index++] = i;
        }
    }
}



    class Solution {
        public void rotate(int[] nums, int k) {
            if (k > nums.length) {
                k = k % nums.length;
            }

            int[] result = new int[nums.length];
            int j = 0;
            for (int i = k; i < nums.length; i++) {
                result[i] = nums[j];
                j++;
            }

            for (int i = 0; i < k; i++) {
                result[i] = nums[j];
                j++;

            }
            System.arraycopy(result, 0, nums, 0, nums.length);
        }
    }   



========================================================================
    
// efficient solution
    
  class Solution {
        public void rotate(int[] nums, int d) {
            if (d > nums.length) {
                d = d % nums.length;
            }
            int n = nums.length-d;
            rotate(nums, 0, n - 1);
            rotate(nums, n, nums.length - 1);
            rotate(nums, 0, nums.length - 1);
            
        }


    static void rotate(int arr[], int low, int high) {
        while (low < high) {
            int temp = arr[low];
            arr[low] = arr[high];
            arr[high] = temp;
            low++;
            high--;
        }
    }
}   

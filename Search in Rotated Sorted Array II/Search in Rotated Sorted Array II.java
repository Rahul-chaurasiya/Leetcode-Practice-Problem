class Solution {
    public boolean search(int[] nums, int target) {
        if(nums[0] == target) return true;
        nums[0] = 10001;
        for(int i=1;i<nums.length;i++){
            if(nums[i] == target) return true;
            else if(nums[i] == 10001) return false;
        }
        return false;
    }
}


=================================================================================


class Solution {
    public boolean search(int[] nums, int target) {
        rotateAndSort(nums);
        int st = 0;
        int end = nums.length-1;

        while(st <= end){
            int mid = (st+end)/2;
            if(nums[mid] == target) return true;
            else if(target < nums[mid]) end=mid-1;
            else st = mid+1;
        }
        return false;
    }

    private static void rotateAndSort(int[] nums) {
        int n = nums.length;
        int pivot = findPivot(nums);

        reverse(nums, 0, pivot - 1);
        reverse(nums, pivot, n - 1);
        reverse(nums, 0, n - 1);
    }

    private static int findPivot(int[] nums) {
        int n = nums.length;
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[i - 1]) {
                return i;
            }
        }
        return 0;
    }

    private static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        boolean arr[] = new boolean[1001];
        int k = 0;
        int ans[] = new int[1000];
        for(int i=0;i<nums1.length;i++){
            arr[nums1[i]] = true;;
        }

        for(int i=0;i<nums2.length;i++){
            if(arr[nums2[i]] == true){ 
                ans[k++] = nums2[i];
                arr[nums2[i]] = false;
            }
        }
        return Arrays.copyOfRange(ans,0,k); 
    }
}


===========================================================================
  
  
  
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int arr[] = new int[1000];
        int k = 0;
        int i = 0;
        int j = 0;
        while(i < nums1.length && j < nums2.length){
            if (i > 0 && nums1[i] == nums1[i - 1]) {
                i++;
                continue;
            }

            if (j > 0 && nums2[j] == nums2[j-1]) {
                j++;
                continue;
            }
          
            if(nums1[i]>nums2[j])j++;
            else if(nums1[i]<nums2[j])i++;
            else {
                arr[k++] = nums1[i];
                i++;
                j++;
            }
        }
        return Arrays.copyOfRange(arr,0,k); 
    }
}

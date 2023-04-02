class Solution {
    public int minNumber(int[] nums1, int[] nums2) {
        int arr[] = new int[10];
        int n = nums1.length;
        int m = nums2.length;
        Arrays.fill(arr,0);
        for(int i=0;i<n;i++)
            arr[nums1[i]]++;
        for(int i=0;i<m;i++)
            arr[nums2[i]]++;
        
        for(int i=0;i<arr.length;i++){
            if(arr[i] >= 2) return i;
        }
        
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        String s = "";
        if(nums1[0]>nums2[0]) s = ""+nums2[0]+nums1[0];
        else s = ""+nums1[0]+nums2[0];
        return Integer.parseInt(s);
    }
}

class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int m = nums1.length;
        int n = nums2.length;
        int l = m + n;
        int arr[] = new int[l];
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < m && j < n) {
            if (nums1[i] <= nums2[j]) arr[k++] = nums1[i++];
            else if (nums1[i] > nums2[j])  arr[k++] = nums2[j++];
        }

        while (i < m) arr[k++] = nums1[i++];
        while (j < n) arr[k++] = nums2[j++];

        if (arr.length % 2 != 0) return (double) arr[arr.length / 2];
        else {
            int mid = arr.length / 2;
            return ((double)(arr[mid] + arr[mid - 1]) / 2);
        }

    }
}

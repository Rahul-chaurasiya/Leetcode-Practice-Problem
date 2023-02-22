class Solution {
    public int trap(int[] arr) {
        int res = 0;
        int n = arr.length;
        int lmax[] = new int[n];
        int rmax[] = new int[n];

        lmax[0] = arr[0];
        for (int i = 1; i < n; i++) {
            lmax[i] = Math.max(lmax[i - 1], arr[i]);
        }

        rmax[n - 1] = arr[n - 1];
        for (int i = n - 2; i >= 0; i--) {
            rmax[i] = Math.max(rmax[i + 1], arr[i]);
        }

        for (int i = 1; i < n-1; i++) {
            res += Math.min(lmax[i], rmax[i]) - arr[i];
        }
        return res;
    }
}

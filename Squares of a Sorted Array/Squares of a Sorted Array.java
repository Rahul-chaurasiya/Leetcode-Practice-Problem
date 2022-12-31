class Solution {
    public int[] sortedSquares(int[] a) {
        for(int i=0;i<a.length;i++)
            a[i] = a[i] * a[i];
        Arrays.sort(a);
        return a;
    }
}

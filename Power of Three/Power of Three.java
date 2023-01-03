class Solution {
    public boolean isPowerOfThree(int n) {
        double p = Math.log10(n)/ Math.log10(3);
        return (p - (int)p == 0);
    }
}

class Solution {
    public boolean judgeSquareSum(int c) {
        long i = 0;
        long j = (long) Math.ceil(Math.sqrt(c));
        while (i <= j) {
            long sum = i * i + j * j;
            if (sum < c) {
                i++;
            } else if (sum > c) {
                j--;
            } else {
                return true;
            }
        }
        return false;
    }
}

class Solution {
    public boolean isPowerOfFour(int n) {
        if(n == 1)return true;
        else if(n%4 != 0 || n <= 0)return false;
        return isPowerOfFour(n/4);
    }
}

============================================================

class Solution {
    public boolean isPowerOfFour(int n) {
        double p = Math.log10(n)/ Math.log10(4);
        return (p - (int)p == 0);
    }
}

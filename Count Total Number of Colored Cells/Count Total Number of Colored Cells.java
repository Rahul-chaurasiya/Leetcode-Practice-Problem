class Solution {
    public long coloredCells(int n) {
        if(n == 1){
            return 1;
        }
        return (long)Math.pow(n,2) + (long)Math.pow(n-1,2);
    }
}

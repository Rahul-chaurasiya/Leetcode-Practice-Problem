
class Solution {
    public int countSetBits(int n) {
        int count = 0;
        while (n > 0) {
            n &= (n - 1);
            count++;
        }
        return count;
    }

    public int countPrimeSetBits(int left, int right) {
        int x=0;
        for(int i=left;i<=right;i++){
            if(countSetBits(i) == 2 || countSetBits(i) == 3 || countSetBits(i) == 5 || countSetBits(i) == 7 || countSetBits(i) == 13 || countSetBits(i) == 11 || countSetBits(i) == 17 || countSetBits(i) == 19){
                x++;
            }
        }
        return x;
    }
}

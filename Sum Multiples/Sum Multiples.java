class Solution {
    public int sumOfMultiples(int n) {
        int sum;
        if(n<3) return 0;
        if(n==3 || n== 4) return 3;
        if(n==5)return 8;
        if(n == 6) return 14;
        if(n == 7) return 21;
        else{
            sum = 21;
            for(int i=8;i<=n;i++){
                if(i%3==0||i%5==0||i%7==0) sum += i;
            }
        }
        return sum;
    }
}

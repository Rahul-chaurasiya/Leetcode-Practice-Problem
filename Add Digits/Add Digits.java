class Solution {
    public int addDigits(int num) {
        if(num == 0)return 0;
        if(num%9 == 0)return 9;
        return num%9;
    }
}


=======================================================


class Solution {
    public int addDigits(int num) {
        int ans = 0;
        int rem = 0;
        while(num != 0){
            rem = num%10;
            num = num/10;
            ans += rem;

            if(num == 0 && ans > 9){
                num = ans;
                ans = 0;
            }
        }
        return ans;
    }
}

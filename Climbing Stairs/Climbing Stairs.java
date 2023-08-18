class Solution {
    public int climbStairs(int n) {
        if(n == 1 || n == 2)return n;
        int prev1 = 1;
        int prev2 = 2;
        int next = 0;
        for(int i = 2; i < n; i++){
            next = prev1 + prev2;
            prev1 = prev2;
            prev2 = next;
        }
        return next;
    }
}

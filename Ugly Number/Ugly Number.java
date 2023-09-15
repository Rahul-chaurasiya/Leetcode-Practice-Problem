class Solution {
    public boolean isUgly(int n) {
        if(n==1) return true;
        if(n==0) return false;
        while(n != 0){
            boolean flag = true;
            if(n%2 == 0){
                n = n/2;
                flag = false;
            }
            if(n%3 == 0){
                n = n/3;
                flag = false;
            }
            if(n%5 == 0){
                n = n/5;
                flag = false;
            }
            if(n == 1 || n == 0) return true;
            if(flag) return false;
        }
        return true;
    }
}

class Solution {
    public int countOperations(int num1, int num2) {
        int count=0;
        while(num1!=0 && num2!=0){
            if(num1==0 && num2==0) return count;

            if(num1>=num2)num1 = num1-num2;
            else num2 = num2-num1;
            count++;
        }
        return count;
    }
}



============================================================
  
  
class Solution {
    // diff == 0 -> 1
    // diff == 1 -> max(a,b)
    // diff == 2 -> max(a,b)/min(a,b)
    public int countOperations(int num1, int num2) {
        int cnt = 0, a = Math.min(num1, num2), b = Math.max(num1, num2);
        while (a != 0 && b!= 0 && a <= b) {
            cnt += b/a;
            b %= a;
            int c = a;
            a = b;
            b = c;
        }
        return cnt;
    }
}

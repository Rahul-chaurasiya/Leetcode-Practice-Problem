class Solution {
    public int romanToInt(String s) {
        int ans = 0;
        int num1 = 0;
        int num2 = 0;
        for(int i=s.length()-1;i>=0;i--){
            switch(s.charAt(i)){
                case 'I' : num1 = 1; break;
                case 'V' : num1 = 5; break;
                case 'X' : num1 = 10; break;
                case 'L' : num1 = 50; break;
                case 'C' : num1 = 100; break;
                case 'D' : num1 = 500; break;
                case 'M' : num1 = 1000; break;
            }

            if(num1 < num2) ans -= num1;
            else ans += num1;
            num2 = num1;
        }
        return ans;
    }
}

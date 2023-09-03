class Solution {
    public int countSymmetricIntegers(int low, int high) {
        int count = 0;
        for(int i=low;i<=high;i++){
            if(sym(i)) count++;
        }
        return count;
    }
    
    public static boolean sym(int num){
        String str = Integer.toString(num);
        if(str.length()%2 != 0) return false;
        int num1 = 0;
        int num2 = 0;
        for(int i=0;i<str.length()/2;i++){
            num1 += Character.getNumericValue(str.charAt(i));
            num2 += Character.getNumericValue(str.charAt(str.length()-1-i));
        }
        
        if(num1 == num2)return true;
        else return false;
    }
}

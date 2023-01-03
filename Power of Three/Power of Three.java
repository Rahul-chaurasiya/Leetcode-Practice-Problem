class Solution {
    public boolean isPowerOfThree(int n) {
        double p = Math.log10(n)/ Math.log10(3);
        return (p - (int)p == 0);
    }
}


=======================================================
    
class Solution {
    public boolean isPowerOfThree(int n) {
        if(n==1)
            return true;
        
        if(n<=0 || n%3!=0) 
            return false;
        
        return isPowerOfThree(n/3);
    }
}

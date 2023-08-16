class GfG
{
	public static int palinArray(int[] a, int n)
    {
        for(int i=0;i<n;i++){
            if(ispalindrome(a[i])==false) return 0;
        }
        
        return 1;
    }
    
    public static boolean ispalindrome(int x){
        int num = x;
        int rem = 0;
        int temp = 0;
        while(x > 0){
            rem = x % 10;
            temp = temp * 10 + rem;
            x /= 10;
        }
        return num == temp;
    }
        
}

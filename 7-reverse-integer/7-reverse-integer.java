class Solution {
    public int reverse(int num) {
        
        int rem;
        long reversed=0;
		while(num!=0)
		{
			rem = num%10;
			num = num/10;
                        reversed = reversed * 10 + rem;
			// if(rem != 0)
			// System.out.print(rem);
		}
        if( reversed > Integer.MAX_VALUE || reversed < Integer.MIN_VALUE)
        return 0;
        
        else return (int)reversed;
        }
        
    
}

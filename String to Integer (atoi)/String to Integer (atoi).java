class Solution {
    public int myAtoi(String s) {
        int sign=1;
        int result=0;
        int i=0;
        int n=s.length();
        while(i<n && s.charAt(i)==' ')
            i++;
        
        if(i<n && s.charAt(i)=='+')
        {
            sign=1;
            i++;
        }
        else if(i<n && s.charAt(i)=='-')
        {
            sign=-1;
            i++;
        }

         while(i<n && 0<=(int)s.charAt(i)-'0' && (int)s.charAt(i)-'0'<=9 )
        {
            
            if(result>Integer.MAX_VALUE/10 || (result==Integer.MAX_VALUE/10 && (int)(s.charAt(i)-'0')>Integer.MAX_VALUE%10))
            {
                return result=(sign==1?Integer.MAX_VALUE:Integer.MIN_VALUE);
            }
            result*=10;
            result+=((int)s.charAt(i)-'0');
            i++;
        }
        return result*sign;
    }
}

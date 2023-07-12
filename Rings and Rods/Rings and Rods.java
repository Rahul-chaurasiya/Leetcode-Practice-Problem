class Solution {
    public int countPoints(String rings) {
          int[] t=new int[10];
        Arrays.fill(t,1);
        for(int i=0;i<rings.length();i=i+2){
            char c=rings.charAt(i);
            int j=rings.charAt(i+1)-'0';
            if(c=='R'){
                if(t[j]%5!=0)
                    t[j]*=5;
            }
            else if(c=='G'){
                if(t[j]%7!=0)
                    t[j]*=7;
            }
            else if(c=='B'){
                if(t[j]%11!=0)
                    t[j]*=11;
            }

        }
        int r=0;
        for(int i=0;i<10;i++){
           if(t[i]%5==0&&t[i]%7==0&&t[i]%11==0)
               r++;
        }
        return r;
    }
}

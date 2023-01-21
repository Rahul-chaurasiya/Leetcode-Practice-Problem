class Solution {
    public int getCommon(int[] num1, int[] num2) {
        int n1=0,n2=0;
        int i=0;
        while(n1<num1.length && n2 < num2.length){
            if(num1[n1] == num2[n2])
                return num1[n1];
            if(num1[n1]>num2[n2]) n2++;
            if(num1[n1]<num2[n2]) n1++;
            i++;
        }
        return -1;
    }
}

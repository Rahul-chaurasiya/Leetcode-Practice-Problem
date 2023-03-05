class Solution {
    public int passThePillow(int n, int time) {
        if(n == 1) return 1;
        int j=1;
        boolean flag = false;
        for(int i=0;i<time;i++){
            if(flag == false){
                if(j == n-1) flag = true;
                System.out.print(j+"->"+(j+1)+" ");
                j++;
            }
            
            else if(flag == true){
                if(j-1 == 1) flag = false;       
                System.out.print((j-1)+"<-"+j+" ");
                j--;
            }
        }
        return j;
    }
}

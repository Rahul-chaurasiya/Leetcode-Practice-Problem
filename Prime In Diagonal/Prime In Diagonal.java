class Solution {
    public int diagonalPrime(int[][] arr) {
        int max = 0;
        for(int i=0;i<arr.length;i++){
            if(isprime(arr[i][i])) max = Math.max(max,arr[i][i]);
            if(isprime(arr[i][arr.length - i - 1])) max= Math.max(max,arr[i][arr.length - i - 1]);
        }
        return max;
    }
    
    public boolean isprime(int x){
        if(x==1) return false;
        if(x==2 || x==3) return true;
        if(x%2==0 || x%3 == 0) return false;
        
        for(int i=5; i*i<=x ; i=i+6){       
            if(x%i == 0 || x%(i+2) == 0) return false;                
        }                                                            
        return true;
    }
}


class Solution {

    boolean isprime(int x){
        if(x==1) return false;
        if(x==2 || x==3) return true;
        if(x%2==0 || x%3 == 0) return false;
        
        for(int i=5; i*i<=x ; i=i+6){                                
            if(x%i == 0 || x%(i+2) == 0) return false;               
        }                                                              
        return true;                                                   
    }


    public int countPrimes(int n) {
        if(n<2) return 0;
        boolean isPrime[] = new boolean[n+1];
        int count;
        if(isprime(n)) count=-1;
        else count=0;
        Arrays.fill(isPrime,true);
        for(int i=2;i*i<=n;i++){
            if(isPrime[i])
			{
				for(int j = 2*i; j <= n; j = j+i)  
				{
					isPrime[j] = false;
				}
			}
        }

        for(int i = 2; i<=n; i++)
		{
			if(isPrime[i])
				count++;
		}
        return count;
    }
}

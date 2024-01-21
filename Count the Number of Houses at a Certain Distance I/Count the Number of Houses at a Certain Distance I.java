class Solution {
    public int[] countOfPairs(int n, int x, int y) {
        int arr[] = new int[n];
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n;j++){
                for(int k=j+1;k<=n;k++){
                    int num1 = Math.abs(j-k);
                    int num2 = Math.abs(y-k)+Math.abs(j-x)+1;
                    int num3 = Math.abs(j-y)+Math.abs(x-k)+1;
                    if(getmin(num1,num2,num3) == i) arr[i-1]+=2;
                }
            }
        }
        return arr;
    }
    
    public int getmin(int x,int y,int z){
        return Math.min(Math.min(x,y),z);
    }
}

class Solution {
    public int minimumAddedCoins(int[] arr, int target) {
        Arrays.sort(arr);
        int x = 1;
        int num = 0;
        for(int i=0;i<arr.length;i++){
            while(arr[i]>x){
                num = increment(num,1);
                x = increment(x,2);
            }
            
            x += arr[i];
            if(check(x,target)) break;
        }
        
        while(x<=target){
            num = increment(num,1);
            x = increment(x,2);
        }
        
        return num;
    }
    
    public int increment(int num,int val){
        if(val == 1) return num+1;
        else return num*2;
    }
    
    public boolean check(int x,int y){
        if(x>y) return true;
        else return false;
    }
}

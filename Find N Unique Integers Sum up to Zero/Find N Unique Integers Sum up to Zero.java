class Solution {
    public int[] sumZero(int n) {
        int arr[] = new int [n];
        if(n==1){
            arr[0] = 0;
            return arr;
        }

        else if(n==2){
            arr[0] = -1;
            arr[1] = 1;
        }

        else if(n%2 == 0){
            int j=0;
            for(int i=0;i<(n/2);i++){
                arr[i] = --j;
            }
            int k=0;
            for(int i=n/2;i<n;i++){
                arr[i] = ++k;
            }
        }

        else if(n%2 != 0){
            int j=0;
            for(int i=0;i<(n/2);i++){
                arr[i] = --j;
            }
            int k=0;
            for(int i=n/2+1;i<n;i++){
                arr[i] = ++k;
            }
            arr[n/2]=0;
        }
        return arr;
    }
}

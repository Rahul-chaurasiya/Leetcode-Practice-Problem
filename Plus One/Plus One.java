class Solution {
    public int[] plusOne(int[] arr) {
        int n = arr.length;
        int x = n;
        if(arr[n-1] == 9){
            while(arr[n-1] == 9){
                arr[n-1]=0;
                n--;

                if(n==0){
                    int temp[] = new int[x+1];
                    temp[0]=1;
                    for(int i=1;i<=x;i++)
                        temp[i] = 0;
                    
                    return temp;
                }
            }
            arr[n-1] = arr[n-1]+1;
        }

        else arr[n-1] = arr[n-1]+1;

        return arr;
    }
}




=============================================================
  
  
// efficient solution
  
  
  
class Solution {
    public int[] plusOne(int[] arr) {
        int n = arr.length;
        int x = n;
        if(arr[n-1] == 9){
            while(arr[n-1] == 9){
                arr[n-1]=0;
                n--;
                if(n==0){
                    arr = new int[arr.length+1];
                    arr[0]=1;
                    return arr;
                }
            }
            arr[n-1] = arr[n-1]+1;
            
        }

        else arr[n-1] = arr[n-1]+1;

        return arr;
    }
}

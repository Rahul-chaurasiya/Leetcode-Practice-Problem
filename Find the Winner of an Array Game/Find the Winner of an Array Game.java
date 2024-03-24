import java.util.ArrayList;
import java.util.List;

class Solution {
    public int getWinner(int[] arr, int k) {
        int[] res = new int[arr.length];
    
    int max = -1;
    
    for( int i = 0; i < arr.length; i++ ){
        
        int r = max == -1 ? 0 : (arr[i]>max ? 1 : 0);
        
        int j = i+1;
        
        while( j < arr.length && arr[i] > arr[j] ){
            r++;
            j++;
        }
        
        max = Math.max(max, arr[i]);
        if( r >= k ) return arr[i];
    }
    
    return max;
    }
}

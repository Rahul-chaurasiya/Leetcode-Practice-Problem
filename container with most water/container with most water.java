

class Solution {
    public int maxArea(int[] arr) {
        int res = 0,n=arr.length;
        int max=0;

    	for(int i = 0; i < n-1 ; i++)
    	{
    		for(int j = i+1; j < n; j++){
    			max = Math.min(arr[i], arr[j])*(j-i);
         		res = (Math.max(max, res));
            }
    	}
    
    	return res;
    }

}

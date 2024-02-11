class Solution {
    public int[][] modifiedMatrix(int[][] arr) {
        int [][]ans = new int[arr.length][arr[0].length];
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                ans[i][j] = arr[i][j];
            }
        }
        
        int max[] = new int[arr[0].length];
        for(int i=0;i<arr[0].length;i++){
            int m = Integer.MIN_VALUE;
            for(int j=0;j<arr.length;j++){
                m = Math.max(arr[j][i],m);
            }
            max[i] = m;
        }
        
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[0].length;j++){
                if(ans[i][j] == -1) ans[i][j] = max[j];
            }
        }
        
        return ans;
    }
}

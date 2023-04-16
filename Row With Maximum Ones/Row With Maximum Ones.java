class Solution {
    public int[] rowAndMaximumOnes(int[][] mat) {
        
        int [][]ans = new int[mat.length][2];
        for(int i=0;i<mat.length;i++){
            int count = 0;
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j] == 1) count++;
            }
            ans[i][0] = i;
            ans[i][1] = count;
        }
        
        int max = -1;
        for(int i=0;i<mat.length;i++){
            max = Math.max(ans[i][1],max);
        }
        int i;
        for(i=0;i<mat.length;i++){
            if(ans[i][1] == max){
                break;                
            }
        }
        return ans[i];
    }
}

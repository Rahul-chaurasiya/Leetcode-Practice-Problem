class Solution {
    public boolean areSimilar(int[][] mat, int k) {
        int col = mat[0].length;
        k = k % col;
        if(k == 0)
            return true;
        
        for(int i=0; i<mat.length; i++){
            for(int j=0; j<col; j++){
                int c = (i%2 == 0) ? ((col + (j - k)) % col) : ((j + k) % col);
                if(mat[i][j] != mat[i][c])
                    return false;
            }
        }
        
        return true;
    }
}

class Solution {
    public int[] findDiagonalOrder(int[][] mat) {
        
        int row = 0;
        int col = 0;
        int m = mat.length;
        int n = mat[0].length;
        int res [] = new int [m * n];

        for(int i=0; i<res.length; i++) {
            res[i] = mat[row][col];

            if((row + col) % 2 == 0) {
                if(col == n-1) row ++;
                else if(row == 0) col ++;
                else {
                    row --;
                    col ++;
                }
            } else {
                if(row == m-1) col ++;
                else if(col == 0) row ++; 
                else {
                    row ++;
                    col --;
                }
            }
        }
        return res;
    }
}

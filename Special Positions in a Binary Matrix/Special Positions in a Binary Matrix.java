class Solution {
    public int numSpecial(int[][] mat) {
        int ans = 0;
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[i].length;j++){
                if(mat[i][j] == 0) continue;
                boolean flag = true;

                for(int r=0;r<mat.length;r++){
                    if(r != i && mat[r][j] == 1){
                        flag = false;
                        break;
                    }
                }

                for(int c=0;c<mat[i].length;c++){
                    if(c != j && mat[i][c] == 1){
                        flag = false;
                        break;
                    }
                }

                if(flag) ans++;
            }
        }
        return ans;
    }
}

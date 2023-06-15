class Solution {
    public void setZeroes(int[][] arr) {
        boolean row=false;
        boolean col=false;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                if(arr[i][j] == 0){
                    if(i == 0) row = true;
                    if(j == 0) col = true;
                    arr[0][j] = 0;
                    arr[i][0] = 0;
                }
            }
        }

        for(int i=1;i<arr.length;i++){
            for(int j=1;j<arr[0].length;j++){
                if(arr[i][0] == 0 || arr[0][j] == 0){
                    arr[i][j] = 0;
                }
            }
        }

        if(row){
            for(int i=0;i<arr[0].length;i++) arr[0][i] = 0;
        }

        if(col){
            for(int i=0;i<arr.length;i++) arr[i][0] = 0;
        }
    }
}

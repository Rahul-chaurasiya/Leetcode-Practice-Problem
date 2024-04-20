class Solution {
    public int[][] findFarmland(int[][] land) {
        List<int[]>result = new ArrayList<>();

        for(int i=0;i<land.length;i++){
            for(int j=0;j<land[0].length;j++){
                if(land[i][j] == 1){
                    int coordinate[] = new int []{i,j,0,0};
                    bfs(land,coordinate,i,j);
                    result.add(coordinate);
                }
            }
        }

        return result.toArray(new int [result.size()][4]);
    }

    private void bfs(int [][]land, int []coordinate, int i, int j){

        if (i < 0 || j < 0 || i > land.length - 1 || j > land[0].length - 1 || land[i][j] != 1) return;
        land[i][j] = 0;
        if (i < coordinate[0]) coordinate[0] = i;
        if (j < coordinate[1]) coordinate[1] = j;
        if (i > coordinate[2]) coordinate[2] = i;
        if (j > coordinate[3]) coordinate[3] = j;
        
        bfs(land, coordinate, i + 1, j);
        bfs(land, coordinate, i - 1, j);
        bfs(land, coordinate, i, j + 1);
        bfs(land, coordinate, i, j - 1);
    }
}

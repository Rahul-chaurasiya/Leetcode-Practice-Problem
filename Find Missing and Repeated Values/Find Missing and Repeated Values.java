class Solution {
    public int[] findMissingAndRepeatedValues(int[][] grid) {
        Map<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid.length;j++){
                hm.put(grid[i][j],hm.getOrDefault(grid[i][j],0)+1);
            }
        }

        int a=-1,b=-1;
        for (int i = 1; i <= grid.length*grid.length; i++) {
            if (hm.containsKey(i)) {
                if (hm.get(i) == 2) a = i;
            }else b = i;
        }
        return new int[]{a,b};
    }
}

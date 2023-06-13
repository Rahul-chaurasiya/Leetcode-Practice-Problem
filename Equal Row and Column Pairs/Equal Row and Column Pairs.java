class Solution {
    public int equalPairs(int[][] grid) {
    int res = 0, n = grid.length;
    HashMap<String, Integer> x = new HashMap<>();
    for(int i=0; i<n; i++){
        StringBuilder sb = new StringBuilder();
        for(int j=0; j<n; j++){
            sb.append(grid[i][j]);
            sb.append(',');
        }
        String curr = sb.toString();
        x.put(curr, x.getOrDefault(curr, 0) +1);
    }
    
    for(int i=0; i<n; i++){
        StringBuilder sb = new StringBuilder();
        for(int j=0; j<n; j++){
            sb.append(grid[j][i]);
            sb.append(',');
        }
        String curr = sb.toString();
        if(x.containsKey(curr))
            res += x.get(curr);
    }
    return res;
}}


================================================================================
  
  
class Solution {
    public int equalPairs(int[][] grid) {
        Map<String,Integer>map=new HashMap<>();
        int count=0;
        for(int i=0;i<grid.length;i++){
            String str = Arrays.toString(grid[i]).replaceAll("\\[|\\]|\\s", "");
            String s = str.replaceAll(",","#");
            map.put(s,map.getOrDefault(s,0)+1);
        }

        for(int i=0;i<grid.length;i++){
            int[] columnArray = new int[grid.length]; 
            for (int j = 0; j < grid.length; j++) {
                columnArray[j] = grid[j][i];
            }
            String str = Arrays.toString(columnArray).replaceAll("\\[|\\]|\\s", "");
            String s = str.replaceAll(",","#");
            if(map.containsKey(s)) count+=map.get(s);
        }
        return count;
    }
}

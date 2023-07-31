class Solution {
    public int leastBricks(List<List<Integer>> wall) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        int col = wall.size();
        int max = 0;
        for(List<Integer>row : wall){
            int edge = 0;
            for(int i=0;i<row.size()-1;i++){
                edge += row.get(i);
                hm.put(edge,hm.getOrDefault(edge,0)+1);
                max = Math.max(max,hm.get(edge));
            }
        }

        return col-max;
    }
}

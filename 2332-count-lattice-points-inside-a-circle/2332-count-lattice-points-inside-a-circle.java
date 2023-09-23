class Solution {
    public int countLatticePoints(int[][] circles) {
        Set<Pair<Integer, Integer>> s = new HashSet<>();
        for(int []circle : circles){
            int x = circle[0];
            int y = circle[1];
            int r = circle[2];
            for(int i=x-r;i<=x+r;i++){
                for(int j=y-r;j<=y+r;j++){
                    if((i-x)*(i-x)+(j-y)*(j-y) <= r*r) s.add(new Pair<>(i,j));
                }
            }
        }
        return s.size();
    }
}
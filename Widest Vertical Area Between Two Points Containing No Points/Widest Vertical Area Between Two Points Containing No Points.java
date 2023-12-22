class Solution {
    public int maxWidthOfVerticalArea(int[][] points) {
        List<Integer>l = new ArrayList<>();
        for(int i=0;i<points.length;i++){
            l.add(points[i][0]);
        }
        Collections.sort(l);
        int ans = 0;
        for(int i=1;i<l.size();i++){
            ans = Math.max(ans,l.get(i)-l.get(i-1));
        }
        return ans;
    }
}

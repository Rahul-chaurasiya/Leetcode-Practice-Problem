class Solution {
    public int minCost(String colors, int[] neededTime) {
        int ans = 0;
        for(int i=0,j=0;i<colors.length()&&j<colors.length();){
            int curttl = 0;
            int maxcur = 0;
            while(j < neededTime.length && colors.charAt(i) == colors.charAt(j)){
                curttl += neededTime[j];
                maxcur = Math.max(maxcur,neededTime[j]);
                j++;
            }
            i=j;
            ans += curttl-maxcur;
        }
        return ans;
    }
}

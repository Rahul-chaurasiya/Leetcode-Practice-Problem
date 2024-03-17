class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        List<int []>l = new ArrayList<>();
        int i;
        for(i=0;i<intervals.length;i++){
            if(intervals[i][1] < newInterval[0]) l.add(intervals[i]);
            else if(intervals[i][0] > newInterval[1]) break;
            else{
                newInterval[0] = Math.min(newInterval[0], intervals[i][0]);
                newInterval[1] = Math.max(newInterval[1], intervals[i][1]);
            }
        }

        l.add(newInterval);
        while(i<intervals.length){
            l.add(intervals[i++]);
        }
        return l.toArray(new int[l.size()][2]);
    }
}

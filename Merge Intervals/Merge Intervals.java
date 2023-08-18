

class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, (a, b) -> Integer.compare(a[0], b[0]));
        List<int[]> l = new ArrayList<>();

        for (int i = 0; i < intervals.length; i++) {
            if (l.isEmpty() || l.get(l.size() - 1)[1] < intervals[i][0]) {
                l.add(intervals[i]);
            } else {
                l.get(l.size() - 1)[1] = Math.max(l.get(l.size() - 1)[1], intervals[i][1]);
            }
        }

        return l.toArray(new int[l.size()][]);
    }
}

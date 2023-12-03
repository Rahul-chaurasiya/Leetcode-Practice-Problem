class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer>l = new ArrayList<>();
        if(mountain.length<=2) return l;
        for(int i=1;i<mountain.length-1;i++){
            if(mountain[i] > mountain[i-1] && mountain[i] > mountain[i+1]) l.add(i);
        }
        return l;
    }
}

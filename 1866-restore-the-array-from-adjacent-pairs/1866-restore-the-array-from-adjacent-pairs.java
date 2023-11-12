class Solution {
    public int[] restoreArray(int[][] arr) {
        HashMap<Integer,List<Integer>>hm = new HashMap<>();
        for(int pair[] : arr){
            hm.putIfAbsent(pair[0],new ArrayList<>());
            hm.putIfAbsent(pair[1],new ArrayList<>());

            hm.get(pair[0]).add(pair[1]);
            hm.get(pair[1]).add(pair[0]);
        }

        int ans[] = new int[arr.length+1];
        for(Map.Entry<Integer, List<Integer>> x : hm.entrySet()){
            if(x.getValue().size() == 1){
                ans[0] = x.getKey();
                ans[1] = x.getValue().get(0);
                break;
            }
        }

        for(int i=2;i<ans.length;i++){
            List<Integer>l = hm.get(ans[i-1]);
            ans[i] = l.get(0) == ans[i - 2] ? l.get(1) : l.get(0);
        }

        return ans;
    }
}
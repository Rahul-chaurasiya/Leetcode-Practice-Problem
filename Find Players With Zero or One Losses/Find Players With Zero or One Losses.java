class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        int[] losses = new int[100001];

        for (int i = 0; i < matches.length; i++) {
            int win = matches[i][0];
            int loss = matches[i][1];

            if (losses[win] == 0) losses[win] = -1;
            if (losses[loss] == -1) losses[loss] = 1;
            else losses[loss]++;
        }

        List<Integer> zeroLoss = new ArrayList<>();
        List<Integer> oneLoss = new ArrayList<>();

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < losses.length; i++) {
            if (losses[i] == -1) zeroLoss.add(i);
            else if (losses[i] == 1) oneLoss.add(i);
        }

        result.add(zeroLoss);
        result.add(oneLoss);
        return result;
    }
}


===================================================================================================


class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer>l = new HashSet<>();
        for(int i=0;i<matches.length;i++){
            l.add(matches[i][0]);
            l.add(matches[i][1]);
        }

        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<matches.length;i++){
            hm.put(matches[i][1],hm.getOrDefault(matches[i][1],0)+1);
        }

        List<List<Integer>> ans = new ArrayList<>();
        List<Integer>l1 = new ArrayList<>();
        List<Integer>l2 = new ArrayList<>();
        for (Integer element : l) {
            if (!hm.containsKey(element)) l1.add(element);
            else if (hm.get(element) == 1) l2.add(element);
        }
        Collections.sort(l1);
        Collections.sort(l2);
        ans.add(l1);
        ans.add(l2);
        return ans;
    }
}

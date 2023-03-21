class Solution {
    public String bestHand(int[] ranks, char[] suits) {
        for(int i=1;i<suits.length;i++){
            if(suits[i] != suits[i-1]) break;
            if(i == suits.length-1) return "Flush";
        }

        int arr[] = new int[14];
        int max = 0;
        for (int i = 0; i < ranks.length; i++) {
            arr[ranks[i]]++;
            max = Math.max(max, arr[ranks[i]]);
        }

        if(max >= 3) return "Three of a Kind";
        if(max == 2 ) return "Pair";
        else return "High Card";
    }
}

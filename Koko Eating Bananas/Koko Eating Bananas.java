class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max = 0;
        for(int x : piles){
            max = Math.max(x,max);
        }

        int low = 1;
        int high = max;

        while(low < high){
            int mid = (low+high)/2;
            if(gethours(piles,mid) > h) low = mid + 1;
            else high = mid;
        }
        return low;
    }

    public int gethours(int []piles, int k){
        int h = 0;
        for(int x : piles){
            h += Math.ceil((double)x/k);
        }
        return h;
    }
}

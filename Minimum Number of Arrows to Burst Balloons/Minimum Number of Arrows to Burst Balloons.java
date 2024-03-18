class Solution {
    public int findMinArrowShots(int[][] arr) {
        Arrays.sort(arr,(a,b) -> Integer.compare(a[1],b[1]));
        int arrows = 1;
        int prev_end = arr[0][1];
        for(int i=0;i<arr.length;i++){
            if(arr[i][0]>prev_end){
                arrows++;
                prev_end = arr[i][1];
            }
        }

        return arrows;
    }
}

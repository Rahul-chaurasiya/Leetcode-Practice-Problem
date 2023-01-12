class Solution {
    public int[] distributeCandies(int candies, int num_people) {
        int arr[] = new int[num_people];
        Arrays.fill(arr,0);
        int i=0,n=1;
        while(candies > 0){
            if(candies < n){
                arr[i%num_people] += candies;
                break;
            }
            arr[i%num_people] += n;
            candies -= n;
            i++;
            n++;
        }
        return arr;
    }
}

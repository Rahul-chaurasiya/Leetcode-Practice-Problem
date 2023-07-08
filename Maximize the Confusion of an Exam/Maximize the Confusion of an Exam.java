class Solution {
    public int maxConsecutiveAnswers(String arr, int k) {
        int countt = 0;
        int countf = 0;
        int max = 0;
        int j=0;
        int i=0;
        while(i<arr.length()){
            if(arr.charAt(i) == 'F') countf++;
            else countt++;
            while(Math.min(countf,countt)>k){
                if(arr.charAt(j)=='F')countf--;
                else countt--;
                j++;
            }
            max = Math.max(max,countt+countf);
            i++;
        }
        return max;
    }
}

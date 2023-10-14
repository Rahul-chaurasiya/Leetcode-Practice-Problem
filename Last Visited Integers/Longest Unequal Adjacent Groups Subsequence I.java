class Solution {
    public List<String> getWordsInLongestSubsequence(int n, String[] arr1, int[] arr2) {
        List<String> l = new ArrayList<String>();
        int ind = arr2[0];
        l.add(arr1[0]);
        for(int i=0;i<arr2.length-1;i++){
            {
                if(arr2[i+1] == ind) continue;
                else{
                    ind = arr2[i+1];
                    l.add(arr1[i+1]);
                }
            }
        }
        return l;
    }
}

class Solution {
    public boolean containsDuplicate(int[] arr) {
        Arrays.sort(arr);
        if(arr.length<2) return false;
        else if(arr.length==2&&arr[0] == arr[1]) return true;
        else{
            //int flag = 0;
            for(int i=0;i<arr.length-1;i++){
                if(arr[i] == arr[i+1]){
                    return true;
                }
            }
        }
        return false;
    }
}

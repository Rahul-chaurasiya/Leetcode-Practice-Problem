class Solution {
    public int distributeCandies(int[] arr) {
        HashMap<Integer,Integer>hm = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            hm.put(arr[i],hm.getOrDefault(arr[i],0)+1);
        }

        if(hm.size()>=arr.length/2)return arr.length/2;
        else return hm.size();
    }
}

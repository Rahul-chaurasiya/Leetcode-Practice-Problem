class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        boolean arr[] = new boolean[126];
        Arrays.fill(arr,false);
        int n = stones.length();
        for(int i=0;i<jewels.length();i++){
            arr[jewels.charAt(i)]=true;
        }

        int count=0;
        for(int i=0;i<stones.length();i++){
            if(arr[stones.charAt(i)]==true) count++;
        }

        return count;
    }
}


=============================================================================
  
  
class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        int n = stones.length();
        int count=0;
        for(int i=0;i<n;i++){
            if(jewels.indexOf(stones.charAt(i))>-1) count++;
        }
        return count;
    }
}

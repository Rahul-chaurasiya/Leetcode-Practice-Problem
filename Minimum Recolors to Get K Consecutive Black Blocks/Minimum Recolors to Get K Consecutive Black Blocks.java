class Solution {
    public int minimumRecolors(String blocks, int k) {
         int mini = k, whiteBlockCount = 0;

        for(int i = 0; i < blocks.length(); i++) {
            if(blocks.charAt(i) == 'W') whiteBlockCount++;
            
            if(i >= k - 1) {
                if(i-k >= 0 && blocks.charAt(i - k) == 'W') whiteBlockCount--;
                mini = Math.min(mini, whiteBlockCount);
            }
        }
        
        return mini;
    }
}

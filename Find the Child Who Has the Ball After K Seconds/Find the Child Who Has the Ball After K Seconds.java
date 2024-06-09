class Solution {
    public int numberOfChild(int n, int k) {
        int pos = 0;
        boolean right = true;
        for(int i=0;i<k;i++){
            if(pos == n-1){
                right = false;
            }else if(pos == 0) right = true;
            if(right){
                pos++;
            }else {
                pos--;
            }
        }
        return pos;
    }
}

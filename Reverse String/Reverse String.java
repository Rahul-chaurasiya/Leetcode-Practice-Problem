class Solution {
    public void reverseString(char[] s) {
        int low = 0;
        int h = s.length;
        int high = h-1;
        while(low<high){
            char temp = s[low];
            s[low] = s[high];
            s[high] = temp;
            low++;
            high--;
        }
    }
}

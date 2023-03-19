class Solution {
    public boolean canConstruct(String ransomnote, String magazine) {
        int arr[] = new int[26];
        Arrays.fill(arr,0);
        for(int i=0;i<magazine.length();i++){
            arr[magazine.charAt(i)-'a']++;
        }
        for(int i=0;i<ransomnote.length();i++){
            arr[ransomnote.charAt(i)-'a']--;
        }

        for(int i=0;i<arr.length;i++){
            if(arr[i]<0) return false;
        }
        return true;
    }
}

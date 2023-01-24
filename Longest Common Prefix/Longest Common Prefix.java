class Solution {
    public String longestCommonPrefix(String[] strs) {
        String s = "";
        int length=Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            length = Math.min(length,strs[i].length());
        }

        int j;
        for(int i=0;i<length;i++){
            boolean flag = true;
            for(j=1;j<strs.length;j++){
                if(strs[j].charAt(i) == strs[j-1].charAt(i)) continue;
                else {
                    flag=false;
                    return s;
                }
            }
            if(flag == true)
            s=s+strs[j-1].charAt(i);

        }
        return s;
    }
}

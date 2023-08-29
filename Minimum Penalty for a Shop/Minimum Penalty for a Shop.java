class Solution {
    public int bestClosingTime(String str) {
        int y[] = new int[str.length()];
        int n[] = new int[str.length()];

        int count = 0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'N')count++;
            n[i] = count;
        }

        count = 0;
        for(int i=str.length()-1;i>=0;i--){
            if(str.charAt(i) == 'Y')count++;
            y[i] = count;
        }

        int ans[] = new int[str.length()+1];
        ans[0] = count;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i) == 'Y') ans[i+1] = y[i]-1+n[i];
            else ans[i+1] = y[i]+n[i];
        }

        

        int min = Integer.MAX_VALUE;
        int min_time_index=0;
        for(int i=0;i<ans.length;i++){
            System.out.print(ans.length);
            if(min > ans[i]){
                min = ans[i];
                min_time_index = i;
            }
        }
        return min_time_index;
    }
}

============================================================================================


class Solution {
    public int bestClosingTime(String str) {
        int score = 0;
        int minscore = 0;
        int count = 0;
        for(int i=0;i<str.length();i++){
            score = str.charAt(i)=='Y'?score+1:score-1;
            if(score > minscore){
                minscore = score;
                count = i+1;
            }
        }
        return count;
    }
}

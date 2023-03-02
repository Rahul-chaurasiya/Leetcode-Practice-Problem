class Solution {
public:
    int compress(vector<char>& chars) {
        int n = chars.size();
        if(n == 1) return 1;
        int i=0,j=0;
        while(i<n){
            int score = 1;
            while(i<n-1&&chars[i]==chars[i+1]){
                score++;
                i++;
            }
            chars[j++] = chars[i++];
            if(score>1){
                string countStr = to_string(score);
                for (char c : countStr) {
                    chars[j++] = c;
                }
            }
        }
        return j;
    }
};

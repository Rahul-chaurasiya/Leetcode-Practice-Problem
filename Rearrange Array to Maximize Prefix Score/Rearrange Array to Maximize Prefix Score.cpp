class Solution {
public:
    int maxScore(vector<int>& nums) {
        sort(nums.begin(), nums.end(), greater<int>());
        int n=nums.size();
        vector<long long>pre(n);
        int ans=0;
        pre[0]=nums[0];
        if(pre[0]>0) ans++;
        for(int i=1; i<n; i++) {
            pre[i]=pre[i-1]+ nums[i];
            if(pre[i]>0) ans++;
        }
        return ans;
    }
};

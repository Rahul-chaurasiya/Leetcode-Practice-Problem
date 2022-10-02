class Solution {
public:
    double findMedianSortedArrays(vector<int>& nums1, vector<int>& nums2) {

        double ans;
        for(int i=0; i<nums2.size(); i++)
            nums1.push_back(nums2[i]);
            sort(nums1.begin(), nums1.end());
            int s = 0, e = nums1.size()-1;
            int mid = s + (e-s)/2;
            if(e%2==0)
            {
            ans = nums1[mid];
            }
            else
            {
                ans = nums1[mid] + nums1[mid+1];
                ans=ans/2;
            }
        return ans;
        
    }
};
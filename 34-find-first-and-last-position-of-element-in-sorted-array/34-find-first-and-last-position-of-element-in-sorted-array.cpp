class Solution {
public:
     vector<int> searchRange(vector<int>& nums, int target) 
{
    vector<int> ans(2, -1);
    int n = nums.size();
    int left = 0, right = n-1, mid;
    while (left<=right)
    {
        mid = left + (right-left)/2 ;
        
        if(nums[mid]==target)
        {
              ans[0] = mid;
              right = mid-1;
        }
        else if(nums[mid]>target)
            right = mid-1;
        else
            left = mid+1;
    }
    
    left = 0, right = n-1;
    while (left<=right)
    {
        mid = left + (right-left)/2;
        
        if(nums[mid]==target)
        {
              ans[1] = mid;
              left = mid+1;
        }
        else if(nums[mid]>target)
            right = mid-1;
        else
            left = mid+1;
    }
    
    return ans;}
};
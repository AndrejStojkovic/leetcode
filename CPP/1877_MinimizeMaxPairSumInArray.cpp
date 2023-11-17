// 1877 - Minimze Maximum Pair Sum in Array

int minPairSum(vector<int>& nums) {
    sort(nums.begin(), nums.end());
    int max = INT_MIN;
    for(int i = 0; i < nums.size() / 2; i++) {
        int val = nums[i] + nums[nums.size() - i - 1];
        if(val > max) {
            max = val;
        }
    }
    return max;
}
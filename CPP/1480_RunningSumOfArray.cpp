// 1480 - Running Sum of 1D Array

vector<int> runningSum(vector<int>& nums) {
    vector<int> res;
    res.resize(nums.size(), 0);
    res[0] = nums[0];
    for(int i = 1; i < nums.size(); i++) {
        res[i] = res[i - 1] + nums[i];
    }
    return res;
}
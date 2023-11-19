// 35 - Search Insert Position

int searchInsert(vector<int>& nums, int target) {
    for(int i = 0; i < nums.size(); i++) {
        if(target <= nums[i]) return i;
        if(i == nums.size() - 1) return i + 1;
    }
    return 0;
}
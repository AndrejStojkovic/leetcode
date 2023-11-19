// 35 - Search Insert Position

public int searchInsert(int[] nums, int target) {
    for(int i = 0; i < nums.length; i++) {
        if(target <= nums[i]) return i;
        if(i == nums.length - 1) return i + 1;
    }
    return 0;
}
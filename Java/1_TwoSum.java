// 1 - TwoSum

public int[] twoSum(int[] nums, int target) {
    Map<Integer, Integer> hash = new HashMap<>();
    for(int i = 0; i < nums.length; i++) {
        int c = target - nums[i];
        if(hash.containsKey(c)) {
            return new int[] { hash.get(c), i };
        }
        hash.put(nums[i], i);
    }
    return new int[] { -1, -1 };
}
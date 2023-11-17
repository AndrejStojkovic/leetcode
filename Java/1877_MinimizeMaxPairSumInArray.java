// 1877 - Minimze Maximum Pair Sum in Array

public int minPairSum(int[] nums) {
    Arrays.sort(nums);
    int max = Integer.MIN_VALUE;
    for(int i = 0; i < nums.length / 2; i++) {
        int val = nums[i] + nums[nums.length - i - 1]; 
        if(val > max) {
            max = val;
        }
    }
    return max;
}
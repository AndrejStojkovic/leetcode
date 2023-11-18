// 11 - Container With Most Water

public int maxArea(int[] height) {
    int res = 0, len = height.length;
    int i = 0, j = len - 1;

    while(i < j) {
        res = Math.max(res, Math.min(height[i], height[j]) * (j - i));
        if(height[i] < height[j]) { i++; }
        else { j--; }
    }

    return res;
}
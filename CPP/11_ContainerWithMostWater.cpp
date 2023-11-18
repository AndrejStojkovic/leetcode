// 11 - Container With Most Water

int maxArea(vector<int>& height) {
    int res = 0, len = height.size();
    int i = 0, j = len - 1;

    while(i < j) {
        res = max(res, min(height[i], height[j]) * (j - i));
        if(height[i] < height[j]) { i++; }
        else { j--; }
    }

    return res;
}
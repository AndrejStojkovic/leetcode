// 231 - Power of Two

public boolean isPowerOfTwo(int n) {
    if(n <= 0) return false;
    int s = 0;
    while(n) {
        s += n & 1;
        n >>= 1;
    }
    return s == 1;
}
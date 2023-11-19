// 231 - Power of Two

bool isPowerOfTwo(int n) {
    if(n <= 0) return false;
    int s = 0;
    while(n) {
        s += n & 1;
        n >>= 1;
    }
    return s == 1;
}
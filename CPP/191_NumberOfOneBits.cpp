// 191 - Number of 1 Bits

int hammingWeight(uint32_t n) {
    int s = 0;
    while(n != 0) {
        s += n & 1;
        n >>= 1;
    }
    return s;
}
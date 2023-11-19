// 190 - Reverse Bits

uint32_t reverseBits(uint32_t n) {
    uint32_t r = 0;
    int x = 0;
    for(int i = 31; i >= 0; i--) {
        if((n & (1 << i)) != 0) {
            r |= 1 << x;
        }
        x++;
    }
    return r;
}
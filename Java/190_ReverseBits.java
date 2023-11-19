// 190 - Reverse Bits

public int reverseBits(int n) {
    int r = 0, x = 0;
    for(int i = 31; i >= 0; i--) {
        if((n & (1 << i)) != 0) {
            r |= 1 << x;
        }
        x++;
    }
    return r;
}
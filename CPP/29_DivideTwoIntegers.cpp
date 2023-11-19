// 29 - Divide Two Integers

int divide(int dividend, int divisor) {
    if(divisor == 1) return dividend;
    if(divisor == -1) {
        if(dividend == INT_MIN) return INT_MAX;
        return -dividend;
    }

    bool isNegative = (divisor < 0 && dividend >= 0) || (divisor >= 0 && dividend < 0);
    long a = dividend, b = divisor;
    a = a < 0 ? -a : a;
    b = b < 0 ? -b : b;

    int ct = 0;
    while(a >= b) {
        a -= b;
        ct++;
    }

    return isNegative ? -ct : ct;
}
// 1137 - Tribonacci Number

public int tribonacci(int n) {
    if(n <= 1) return n;

    int a = 0, b = 0, c = 1;
    int d = a + b + c;
    for(int i = 2; i <= n; i++) {
        d = a + b + c;
        a = b; b = c; c = d;
    }

    return d;
}
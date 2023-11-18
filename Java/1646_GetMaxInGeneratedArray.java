// 1646 - Get Maximum in Generater Array

public int getMaximumGenerated(int n) {
    if(n <= 1) return n;

    int [] arr = new int[n + 1];
    arr[0] = 0;
    arr[1] = 1;

    int r = Integer.MIN_VALUE;
    for(int i = 2; i <= n; i++) {
        arr[i] = arr[i / 2];
        if(i % 2 != 0) arr[i] += arr[(i / 2) + 1];
        r = Math.max(r, arr[i]);
    }

    return r;
}
// 1646 - Get Maximum in Generated Array

int getMaximumGenerated(int n) {
    if(n <= 1) return n;

    int arr[n + 1];
    arr[0] = 0;
    arr[1] = 1;

    int r = INT_MIN;
    for(int i = 2; i <= n; i++) {
        arr[i] = arr[i / 2];
        if(i & 1) arr[i] += arr[(i / 2) + 1];
        r = max(r, arr[i]);
    }

    return r;
}
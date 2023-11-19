// 1672 - Richest Customer Wealth

public int maximumWealth(int[][] accounts) {
    int max = 0, s = 0;
    for(int i = 0; i < accounts.length; i++) {
        s = 0;
        for(int j = 0; j < accounts[i].length; j++) {
            s += accounts[i][j];
        }
        max = Math.max(max, s);
    }
    return max;
}
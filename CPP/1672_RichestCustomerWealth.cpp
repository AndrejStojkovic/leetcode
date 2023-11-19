// 1672 - Richest Customer Wealth

int maximumWealth(vector<vector<int>>& accounts) {
    int r = 0, s = 0;
    for(int i = 0; i < accounts.size(); i++) {
        s = 0;
        for(int j = 0; j < accounts[i].size(); j++) {
            s += accounts[i][j];
        }
        r = max(r, s);
    }
    return r;
}
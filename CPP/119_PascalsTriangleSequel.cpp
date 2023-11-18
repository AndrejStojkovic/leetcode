// 119 - Pascal's Triangle 2

vector<int> getRow(int rowIndex) {
    vector<vector<int>> p;
    for(int i = 0; i <= rowIndex; i++) {
        vector<int> row;
        row.resize(i + 1, 1);
        for(int j = 1; j < i; j++) {
            row[j] = p[i - 1][j - 1] + p[i - 1][j];
        }
        p.push_back(row);
    }
    return p[rowIndex];
}
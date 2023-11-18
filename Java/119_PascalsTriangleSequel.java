// 119 - Pascal's Triangle 2

public List<Integer> getRow(int rowIndex) {
    List<List<Integer>> p = new ArrayList<>(rowIndex);

    for(int i = 0; i <= rowIndex; i++) {
        List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));
        for(int j = 1; j < i; j++) {
            row.set(j, p.get(i - 1).get(j - 1) + p.get(i - 1).get(j));
        }
        p.add(row);
    }

    return p.get(rowIndex);
}
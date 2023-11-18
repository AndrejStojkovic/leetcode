// 118 - Pascal's Triangle

public List<List<Integer>> generate(int numRows) {
    if(numRows == 0) return null;
    List<List<Integer>> p = new ArrayList<>(numRows);

    for(int i = 0; i < numRows; i++) {
        List<Integer> row = new ArrayList<>(Collections.nCopies(i + 1, 1));
        for(int j = 1; j < i; j++) {
            row.set(j, p.get(i - 1).get(j - 1) + p.get(i - 1).get(j));
        }
        p.add(row);
    }

    return p;
}
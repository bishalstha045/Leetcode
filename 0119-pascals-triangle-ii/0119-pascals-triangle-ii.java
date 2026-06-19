class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<Integer> row = new ArrayList<>();
        row.add(1);
        for(int i = 1; i <= rowIndex; i++) {
            List<Integer> newRow = new ArrayList<>();
            for(int j = 0; j <= i; j++) {
                if(j == 0 || j == i) {
                    newRow.add(1);
                }
                else {
                    newRow.add(
                        row.get(j - 1)
                        + row.get(j)
                    );
                }
            }
            row = newRow;
        }
        return row;
    }
}
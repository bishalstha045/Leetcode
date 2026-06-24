class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int m = mat.length;      // original rows
        int n = mat[0].length;   // original columns

        // Reshape not possible
        if (m * n != r * c) {
            return mat;
        }

        int[][] ans = new int[r][c];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                // Convert current position to 1D index
                int index = i * n + j;

                // Convert 1D index to new matrix position
                int newRow = index / c;
                int newCol = index % c;

                ans[newRow][newCol] = mat[i][j];
            }
        }

        return ans;
    }
}
class Solution {
    public int[][] spiralMatrixIII(int rows, int cols,int rStart, int cStart) {
        int[][] ans = new int[rows * cols][2];
        int count = 0;
        ans[count++] = new int[]{rStart, cStart};
        int steps = 1;
        while (count < rows * cols) {
            // Right
            for (int i = 0; i < steps; i++) {
                cStart++;
                if (rStart >= 0 && rStart < rows &&
                    cStart >= 0 && cStart < cols) {
                    ans[count++] = new int[]{rStart, cStart};
                }
            }
            // Down
            for (int i = 0; i < steps; i++) {
                rStart++;
                if (rStart >= 0 && rStart < rows &&
                    cStart >= 0 && cStart < cols) {
                    ans[count++] = new int[]{rStart, cStart};
                }
            }
            steps++;
            // Left
            for (int i = 0; i < steps; i++) {
                cStart--;
                if (rStart >= 0 && rStart < rows &&
                    cStart >= 0 && cStart < cols) {
                    ans[count++] = new int[]{rStart, cStart};
                }
            }
            // Up
            for (int i = 0; i < steps; i++) {
                rStart--;
                if (rStart >= 0 && rStart < rows &&
                    cStart >= 0 && cStart < cols) {
                    ans[count++] = new int[]{rStart, cStart};
                }
            }
            steps++;
        }
        return ans;
    }
}
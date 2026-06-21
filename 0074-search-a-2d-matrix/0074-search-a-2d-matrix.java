// using binary search 
class Solution {
    public static boolean searchMatrix(int[][] matrix, int target) {
        int rows = matrix.length;
        int cols = matrix[0].length;
        int start = 0;
        int end = rows * cols - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int row = mid / cols;
            int col = mid % cols;
            if (matrix[row][col] == target) {
                return true;
            }
            else if (matrix[row][col] < target) {
                start = mid + 1;
            }
            else {
                end = mid - 1;
            }
        }
        return false;
    }

}

/*
//can be solved using top right search same as 240 for row col sorted matrix
int row = 0;
int col = matrix[0].length - 1;

while(row < matrix.length && col >= 0){

    if(matrix[row][col] == target)
        return true;

    else if(matrix[row][col] > target)
        col--;

    else
        row++;
}
 */
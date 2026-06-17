class Solution {
    public int diagonalSum(int[][] mat) {
        int n=mat.length;
        int sum=0;
        for(int i=0;i<n;i++){
            sum += mat[i][i];// for primary diagonal
            sum += mat[i][n-1-i];//for secondary diagonal 
        }
        if(n%2==1){ //if the matrix is of odd order then we will simply remove the midle index since it will be added twice
            sum -= mat[n/2][n/2];
        }
        return sum;
    }
}

//note: for secondary daigonal sum will be always equal to n-1, i.e row + column = n-1  , in our case in primary daigonal both row and column are i , but for secondary matrix we can substitute the column value
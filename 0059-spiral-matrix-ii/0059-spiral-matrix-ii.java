class Solution {
    public int[][] generateMatrix(int n) {
        int[][] spiral = new int[n][n];
        int left=0;
        int right=n-1;
        int top=0;
        int bottom=n-1;
        int count=1;
        while(left<=right && top<=bottom){
            //left to right
            for(int j=left;j<=right;j++){
                spiral[top][j]=count;
                count++;
            }
            top++;
            for(int i=top;i<=bottom;i++){
                spiral[i][right]= count;
                count++;
            }
            right--;
            if(top<=bottom){
                for(int j=right;j>=left;j--){
                    spiral[bottom][j]=count;
                    count++;
                }
                bottom--;
            }
            if(left<=right){
                for(int i=bottom;i>=top;i--){
                    spiral[i][left]=count;
                    count++;
                }
                left++;
            }
        }
        return spiral;
    }
}
/*
    similar to spiral matrix same approach was applied, here in this problem i created a new 2d spiral matrix to store count from 1 to n*n and i use the spiral matrix logic to put number exactly to their place 
    i also check if cases is only single row or column was left inorder to prevent from overwritting
    
 */
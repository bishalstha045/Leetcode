class Solution {
    public void gameOfLife(int[][] board) {
        int r=board.length;
        int c=board[0].length;
        int [][] ans= new int[r][c];
        int []dr ={-1,-1,-1,0,0,1,1,1};
        int []dc ={-1,0,1,-1,1,-1,0,1};
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                int live=0;
                for(int k=0;k<8;k++){
                    int nr= i + dr[k];
                    int nc= j + dc[k];
                    if(nr>=0 && nr<r && nc>=0 && nc<c && board[nr][nc]==1){
                        live++;
                    }
                }
                // using rule provided
                if(board[i][j]==1){
                   if (live ==2 || live ==3){
                        ans[i][j]=1;
                }//no need to write extra condition for 0 since matrix element is already 0 when initialized
                }
                else{
                    if(live==3){
                        ans[i][j]=1;
                    }
                }

            }
        }
        // copying the elements from new ans array to actual array
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                board[i][j]=ans[i][j];
            }
        }
    }
}

/*
Approach:
1. Create a new 2D array 'ans' to store the next state of the board.
2. Use two 1D arrays (dr and dc) to represent the row and column offsets of the 8 neighbouring cells.
3. Traverse every cell of the matrix.
4. For each cell, visit all 8 neighbours using dr and dc and count the number of live neighbours.
5. Apply the Game of Life rules:
   - A live cell survives if it has 2 or 3 live neighbours.
   - A dead cell becomes alive if it has exactly 3 live neighbours.
6. Since 'ans' is initialized with 0 by default, there is no need to explicitly assign 0 for dead cells.
7. Finally, copy the values from 'ans' back to the original board.
*/
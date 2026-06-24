class Solution {
    public int numSpecial(int[][] mat) {
      int r=mat.length;
      int c=mat[0].length;
      int count=0;
      for(int i=0;i<r;i++){
        for(int j=0;j<c;j++){
            if(mat[i][j]==1){
                boolean special=true;
                //checking row
                for(int col=0;col<c;col++){
                    if(col!=j && mat[i][col]==1){ // col!=j means dont check the current cell itself 
                        special=false;
                        break;
                    }
                }
                //checking col
                if(special){
                for(int row=0;row<r;row++){
                    if(row!=i && mat[row][j]==1){ // same for row!=i , dont check the current element itself
                        special=false;
                        break;
                    }
                }
                }
                if(special){
                    count++;
                }
            }
        }
      }
      return count;
    }
}
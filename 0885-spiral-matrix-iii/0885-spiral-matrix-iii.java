class Solution {
    public int[][] spiralMatrixIII(int rows, int cols, int rStart, int cStart) {
        int [][] ans = new int [rows * cols][2];
        int count=0;
        ans[count++] = new int []{rStart, cStart};
        int step=1;
        while(count< rows*cols){
            //right
            for(int i=0;i<step;i++){
                cStart++;
                if(rStart>=0 && rStart<rows &&  cStart>=0 && cStart<cols){
                    ans[count++] = new int []{rStart, cStart};
                }
            }
            //down
            for(int i=0;i<step;i++){
                rStart++;
                if(rStart>=0 && rStart<rows &&  cStart>=0 && cStart<cols){
                    ans[count++] = new int []{rStart, cStart};
                }
            }
            step++;
            //left
            for(int i=0;i<step;i++){
                cStart--;
                if(rStart>=0 && rStart<rows &&  cStart>=0 && cStart<cols){
                    ans[count++] = new int []{rStart, cStart};
                }
            }
            //up
            for(int i=0;i<step;i++){
                rStart--;
                if(rStart>=0 && rStart<rows &&  cStart>=0 && cStart<cols){
                    ans[count++] = new int []{rStart, cStart};
                }
            }
            step++;
        }
        return ans;
    }
}
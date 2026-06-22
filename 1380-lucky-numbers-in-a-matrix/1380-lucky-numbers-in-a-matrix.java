class Solution {
    public List<Integer> luckyNumbers(int[][] matrix) {
        List<Integer> ans= new ArrayList<>();
        for(int i=0;i<matrix.length ; i++){
            int mincol=0;
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]<matrix[i][mincol]){
                    mincol=j;
                }
            }
            int lucky= matrix[i][mincol];
            boolean islucky =true;
            for(int r=0;r<matrix.length;r++){
                if(matrix[r][mincol] > lucky){
                    islucky = false;
                    break;
                }
            }
            if(islucky){
                ans.add(lucky);
            }
        }
        return ans;
    }
}

/*
created a list first to store ans
firstly traversing each rows and find out the min value of that row, for this i have used a mincol variable that will help me fix the column
then abter that checking condition i can finally get actualy mincol value and i have put this into a lucky variable which stores min value of each row
i assume the number is lucky initially using boolean variable now then i travese to that particular column with the help of fixed mincol value and then if any number is greater than that lucky number then we can find out that the number is not lucky if it doesnt satisfy that check part that mean the number is actually a lucky number 

 */
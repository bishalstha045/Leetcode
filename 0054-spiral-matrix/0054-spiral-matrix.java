class Solution {
    public List<Integer> spiralOrder(int[][] matrix) {
        int top=0;
        int bot=matrix.length - 1;
        int left=0;
        int right= matrix[0].length- 1;
        List<Integer> ans = new ArrayList<>();
        while(top<= bot && left<=right){
            // for left to right
            for(int j=left;j<=right;j++){
                ans.add(matrix[top][j]);
            }
            top++;
            //top to bot
            for(int i=top;i<=bot;i++)
            {
                ans.add(matrix[i][right]);
            }
            right--;
            //right to left
            if(top<=bot){
                for(int j=right;j>=left;j--){
                    ans.add(matrix[bot][j]);
                }
                bot--;
            }
            if(left<=right){
                for(int i=bot;i>=top;i--){
                    ans.add(matrix[i][left]);
                }
            }
            left++;
        }
        return ans;
    }
}
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> traingle = new ArrayList<>();
        for(int i=0;i<numRows;i++){
            List<Integer> row = new ArrayList<>();
            for(int j=0;j<=i;j++){
                if(j==0 || j==i){
                    row.add(1);
                }
                else{
                    row.add(traingle.get(i-1).get(j) + traingle.get(i-1).get(j-1));
                }
            }
             traingle.add(row);
        }
        return traingle;
    }
}

// so it is a simple 2d arraylist question, just remember cases:
// case 1 : for corner elements its always 1 i.e when j=0 and j=i its always 1
// caase 2: for middle element , go to previous row and add elment and go to left 
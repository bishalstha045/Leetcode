class Solution {
    public List<Integer> getRow(int rowIndex) {
        List<List<Integer>> traingle = new ArrayList<>();
        for(int i=0;i<=rowIndex;i++){
            List<Integer> row= new ArrayList<>();
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
        return traingle.get(rowIndex);
    }
}
// similar to pascal triangle but we just have to return the index 
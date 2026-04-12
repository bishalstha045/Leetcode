import java.util.ArrayList;
class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int n=candies.length;
        ArrayList<Boolean> arr= new ArrayList<>(n);
        int max=0;
        for(int i=0;i<n;i++){
        if(candies[i]>max){
            max=candies[i];
           }
        }
        for(int i=0;i<n;i++){
            if((candies[i]+extraCandies) >= max){
            arr.add(true); 
            }
            else{
                arr.add(false);
            }
        }

        // for(int el : candies){
        //     arr.add(c+extraCandies > max)
        // } // this or that above for loop both are same
        

        return arr;
    }
}
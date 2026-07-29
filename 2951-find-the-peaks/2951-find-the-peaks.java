class Solution {
    public List<Integer> findPeaks(int[] mountain) {
        List<Integer> ans= new ArrayList<>();
        for(int i=1;i<mountain.length-1;i++){
            if(mountain[i]>mountain[i-1]&&mountain[i]>mountain[i+1])ans.add(i);
        }
        return ans;
    }
}
/*
create an array list and traverse through the array
and check elements previous and next elemnet if it is greater than them and add it into list
now return list
 */
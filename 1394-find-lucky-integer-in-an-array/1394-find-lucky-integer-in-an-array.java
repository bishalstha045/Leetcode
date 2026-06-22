class Solution {
    public int findLucky(int[] arr) {
        int []freq = new int[501];
        for(int el:arr){
            freq[el]++;
        }
        for(int i=500;i>0;i--){
            if(i== freq[i]) return i;
        }
        return -1;
    }
}

// simply i first counted the frequency of each element in between 1 to 500 so i created frequency array with size 501 as it is given in constraints
// then i check if the index is equals to its frequency from top (i.e from largest number i traverse the array nad started checking) , if yes then return that index otherwise return -1
class Solution {
    public int largestAltitude(int[] gain) {
        int []prefix =new int[gain.length +1];
        prefix[0]=0;
        for(int i=0;i<gain.length;i++){
            prefix[i+1]=prefix[i]+gain[i];
        }
        int max=Integer.MIN_VALUE;
        for(int el:prefix){
            if(el>max) max=el;
        }
        return max;
    }
}
// so firstly create a prefix array which will store peak point of current and previous point and acc to question it says first point is always 0, so i create prefix array with size 1 more than that of gain array then i simply use the comcept of prefix sum to find sum for every index then acc to question, to find maximum peak altitude i just find out the max value inside of that array and simply i retured that max value
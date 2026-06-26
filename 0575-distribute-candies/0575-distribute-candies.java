class Solution {
    public int distributeCandies(int[] candyType) {
        int n=candyType.length;
        Arrays.sort(candyType);
        int dis=1;
        for(int i=1;i<n;i++){
            if(candyType[i]!=candyType[i-1]){
                dis++;
            }
        }
        int len=n/2;
        return Math.min(len,dis);
    }
}
class Solution {
    public int maxSatisfied(int[] customers, int[] grumpy, int minutes) {
        int insatis=0;
        for(int i=0;i<customers.length;i++){
            if(grumpy[i]==0){
                insatis+=customers[i];
            }
        }
        //for extra consecutive part, for this we using sliding window concept
        int exsatis=0;
        int maxsatis=0;
        int left=0;
        for(int right=0;right<customers.length;right++){
            if(grumpy[right]==1){
                exsatis+=customers[right];
            }
            if((right-left+1)>minutes){
                if(grumpy[left]==1){
                    exsatis-=customers[left];
                }
                left++;
            }
            maxsatis=Math.max(maxsatis,exsatis);
        }
        int result= insatis+maxsatis;
        return result;
    }
}
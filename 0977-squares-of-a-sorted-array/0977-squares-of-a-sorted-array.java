// class Solution {
//     public int[] sortedSquares(int[] nums) {
//         int []square= new int[nums.length];
//         for(int i=0;i<nums.length;i++){
//             square[i]=nums[i]*nums[i];
//         }
//         int temp;
//         for(int i=0;i<square.length;i++){
//             for(int j=i+1;j<square.length;j++){
//             if(square[i]>square[j]){
//                 temp=square[i];
//                 square[i]=square[j];
//                 square[j]=temp;
//             }
//             }
//         }
//         return square;
//     }
// } // here its time complexity is O(n2) so we gonna use two pointer instead


class Solution {
    public int[] sortedSquares(int[] nums) {
    int n=nums.length;
    int[]result =new int[n];
    int left=0; // pointer from starting
    int right=n-1; // pointer from ending
    int k=n-1; // to put the greatest square from last position so as to maintain ascending order
    while(left<=right){
        int left_square=nums[left]*nums[left];
        int right_square=nums[right]*nums[right];
        if(left_square>right_square){
            result[k]=left_square;
            left++;
        }
        else{
            result[k]=right_square;
            right--;
        }
        k--;
    }
    return result;

    }

}
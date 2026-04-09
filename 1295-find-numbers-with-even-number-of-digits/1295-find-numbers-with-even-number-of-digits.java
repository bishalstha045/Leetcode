// class Solution {
//     public int findNumbers(int[] nums) {
//         int even_count = 0;
        
//         for (int i = 0; i < nums.length; i++) {
//             int c = 0;  
//             int num = nums[i];
            
//             while (num != 0) {
//                 num /= 10;
//                 c++;
//             }
            
//             if (c % 2 == 0) {
//                 even_count++;
//             }
//         }
        
//         return even_count;
//     }
// }// time complexity O(n2)

class Solution{
    public int findNumbers(int[] nums){
        int even_counter=0;
        for(int i=0;i<nums.length;i++){
            int num=nums[i];
            int digits=(num==0)?1:(int)(Math.log10(num)+1);
            if(digits%2==0){
                even_counter++;
            }
        }
        return even_counter;
    }
}
// Math.log10(num) +1 is used to find number of digits in a number
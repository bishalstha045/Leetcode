// class Solution {
//     public boolean increasingTriplet(int[] nums) {
//         int first=Integer.MAX_VALUE;
//         int second=Integer.MAX_VALUE;
//         int third=Integer.MAX_VALUE;
//         for(int i=0;i<nums.length; i++){
//             int el =nums[i];
//             if(first =>el){
//                 first=el;
//             }
//             else if(second = > el){
//                 second =el;
//             }
//             else{
//                 third =el;
//                 return true;
//             }
//         }
//         return false;
//     }
// }


class Solution {
    public boolean increasingTriplet(int[] nums) {
        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int num : nums) {
            if (num <= first) {
                first = num;          // smallest so far
            } else if (num <= second) {
                second = num;         // second smallest
            } else {
                return true;          // found third > second
            }
        }
        return false;
    }
}
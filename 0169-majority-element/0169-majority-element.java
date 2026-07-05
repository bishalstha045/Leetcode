
// Boyer-Moore Voting Algorithm
class Solution {
    public int majorityElement(int[] nums) {
        int candidate = 0;
        int count = 0;
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        return candidate;
    }
}
//time =O(n) , space= O(1)


// class Solution {
//     public int majorityElement(int[] nums) {
//         int n=nums.length;
//         HashMap<Integer,Integer> map =new HashMap<>();
//         for(int el:nums){
//             map.put(el,map.getOrDefault(el,0)+1);
//             if(map.get(el)>n/2)return el;
//         }
//         return -1;
//     }
// }
//using Hashmap technique whose time complexity is O(n) but space also O(n) 

// class Solution {
//     public int majorityElement(int[] nums) {
//         int n=nums.length;
//         Arrays.sort(nums);
//         return nums[n/2];
//     }
// }
// using sorting technique, time complexity is O(nlogn)
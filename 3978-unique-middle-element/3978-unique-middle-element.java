class Solution {
    public boolean isMiddleElementUnique(int[] nums) {
        int count=0;
        int n=nums.length;
        int mid=nums[n/2];
        for(int el:nums){
            if(el==mid)count++;
        }
        return (count==1)?true:false;
    }
}
//using brute force, time =O(n),space=O(1)

// class Solution {
//     public boolean isMiddleElementUnique(int[] nums) {
//         int n=nums.length;
//         HashMap<Integer,Integer> map=new HashMap<>();
//         for(int el:nums){
//             map.put(el,map.getOrDefault(el,0)+1);
//         }

//         return map.get(nums[n/2])==1;
//     }
// }
//using hashmap , O(n) but space also O(n)
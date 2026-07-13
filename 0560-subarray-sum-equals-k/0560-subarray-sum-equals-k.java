class Solution {
    public int subarraySum(int[] nums, int k) {
       HashMap<Integer,Integer> map =new HashMap<>();
       map.put(0,1);
       int count=0;
       int prefix=0;
       for(int el:nums){
        prefix+=el;
        if(map.containsKey(prefix-k)){
            count+=map.get(prefix-k);
        }
        map.put(prefix,map.getOrDefault(prefix,0)+1);
       }
       return count;
    }
}

// class Solution {
//     public int subarraySum(int[] nums, int k) {
//         int n= nums.length;
//         int count=0;
//         for(int i=0;i<n;i++){
//             int sum=0;
//             for(int j=i;j<n;j++){
//                 sum+=nums[j];
//                  if(sum==k){
//                 count++;
//             }
//             }
//         }
//         return count;
//     }
// }
 // Generate all subarrays starting from i
 //if valid subarray found then add it to count
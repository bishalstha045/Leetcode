class Solution {
    public int maxSum(int[] nums) {
        int []freq= new int[10];
        int ans=-1;
        for(int num:nums){
            int getmax=maxDigit(num);
            if(freq[getmax]!=0){
                ans=Math.max(ans,freq[getmax]+num);
            }
            freq[getmax]=Math.max(freq[getmax],num);
        }
        return ans;
    }
    public int maxDigit(int n){
        int max=0;
        while(n!=0){
            max=Math.max(max,n%10);
            n/=10;
        }
        return max;
    }
}
// Store the largest number for each maximum digit (0-9) in an array.
// If another number has the same maximum digit, update the maximum pair sum
// and keep only the larger number for future comparisons.

// class Solution {
//     public int maxSum(int[] nums) {
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int ans = -1;
//         for (int num : nums) {
//             int maxDigit = getMaxDigit(num);
//             if (map.containsKey(maxDigit)) {
//                 ans = Math.max(ans, map.get(maxDigit) + num);
//                 map.put(maxDigit, Math.max(map.get(maxDigit), num));
//             } else {
//                 map.put(maxDigit, num);
//             }
//         }
//         return ans;
//     }
//     private int getMaxDigit(int num) {
//         int max = 0;
//         while (num > 0) {
//             max = Math.max(max, num % 10);
//             num /= 10;
//         }
//         return max;
//     }
// }
// Store the largest number for each maximum digit (0-9).
// When another number has the same maximum digit, calculate their sum
// and update the answer. Keep only the larger number for future pairs.
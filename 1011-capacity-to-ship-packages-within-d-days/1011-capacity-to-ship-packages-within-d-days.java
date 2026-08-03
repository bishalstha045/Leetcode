class Solution {
    public int shipWithinDays(int[] weights, int days) {
        int sum=0;
        int max=0;
        for(int el:weights){
            sum+=el;
            max=Math.max(max,el);
        }
        int low=max;
        int high=sum;
        int ans=-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            if(requireDay(weights,mid)<=days){
                ans=mid;
                high=mid-1;
            }
            else low=mid+1;
        }
        return ans;
    }
    public int requireDay(int []weights,int cap){
        int day=1;
        int load=0;
        for(int i=0;i<weights.length;i++){
            if(load+weights[i]>cap){
                day++;
                load=weights[i];
            }
            else load+=weights[i];
        }
        return day;
    }
}
// Binary Search on the answer (ship capacity).
// The minimum capacity is the maximum weight,
// and the maximum capacity is the sum of all weights.
// For each middle capacity, calculate the required days.
// If it can ship within the given days, try a smaller capacity.
// Otherwise, increase the capacity.
// Time Complexity: O(n * log(sum))
// Space Complexity: O(1)



// class Solution {
//     public int shipWithinDays(int[] weights, int days) {
//         int sum=0;
//         int max=0;
//         for(int el:weights){
//             sum+=el;
//             max=Math.max(max,el);
//         }
//         for(int cap=max;cap<=sum;max++){
//             if(requireDay(weights,cap)<=days)return cap;
//         }
//         return -1;
//     }
//     public int requireDay(int []weights, int cap){
//         int day=1;
//         int load=0;
//         for(int i=0;i<weights.length;i++){
//             if(load+weights[i]>cap){
//                 day=day+1;
//                 load=weights[i];
//             }
//             else load+=weights[i];
//         }
//         return day;
//     }
// }
// Brute Force Approach
// Try every possible ship capacity from max weight to total weight.
// For each capacity, calculate the required shipping days.
// The first capacity that ships within the given days is the answer.
// This approach is slow because it checks every capacity,
// so it gives Time Limit Exceeded (TLE).
// Time Complexity: O((sum - max + 1) * n)
// Space Complexity: O(1)
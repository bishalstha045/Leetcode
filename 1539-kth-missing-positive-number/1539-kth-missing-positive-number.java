class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid = low + (high- low)/2;
            int actual_no=mid+1;
            int missing_no=arr[mid]-actual_no;
            if(missing_no >= k) high=mid-1;
            else low=mid+1;
        }
        return low+k;
    }
}


// Intuition:
// At index i, expected number = i + 1
// Missing numbers till index i = arr[i] - (i + 1)
//
// We use binary search to find the smallest index where
// missing numbers >= k.
//
// If missing >= k → move left
// Else → move right
//
// Finally, answer = k + low
// (low represents how many elements are before kth missing)
//
// Time Complexity: O(log n)
// Space Complexity: O(1)
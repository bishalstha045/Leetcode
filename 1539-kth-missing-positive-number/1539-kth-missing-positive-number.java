class Solution {
    public int findKthPositive(int[] arr, int k) {
        int low=0;
        int high=arr.length-1;
        while(low<=high){
            int mid=low+(high-low)/2;
            int actual=mid+1;
            int missing=arr[mid]-actual;
            if(missing<k)low=mid+1;
            else high=mid-1;
        }
        return low+k;
    }
}


// Intuition:
// At index i, expected number = i + 1
// Missing numbers till index i = arr[i] - (i + 1)
// We use binary search to find the smallest index where
// missing numbers >= k.
// If missing >= k → move left
// Else → move right
// Finally, answer = k + low
// (low represents how many elements are before kth missing)
// Time Complexity: O(log n)
// Space Complexity: O(1)
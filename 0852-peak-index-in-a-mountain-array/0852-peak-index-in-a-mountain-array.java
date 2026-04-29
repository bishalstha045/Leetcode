class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int low =1;
        int high = arr.length -2;
        while(low<= high){
            int mid = low + (high - low)/2 ;
            if(arr[mid]> arr[mid +1] && arr[mid]> arr[mid -1 ]){
                return mid ;
            }
            else if (arr[mid]> arr[mid -1] && arr[mid]< arr[mid + 1]){
                low = mid +1;
            }
            else{
                high = mid -1;
            }
        }
        return -1;
    }
}

// Binary search approach
// If mid < mid+1 → we are on increasing slope → move right
// Else → we are on decreasing slope → move left (including mid)
// Eventually low == high → peak index
// Time: O(log n), Space: O(1)
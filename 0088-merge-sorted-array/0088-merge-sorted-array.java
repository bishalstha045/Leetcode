class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i=m-1;
        int j=n-1;
        int k=n+m -1;
        while(i>=0 && j>= 0){
            if(nums1[i]>nums2[j]){
                nums1[k--]=nums1[i--];
            }
            else {
                nums1[k--]=nums2[j--];
            }
        }
        while(j>=0){
            nums1[k--]=nums2[j--];
        }
    }
}

// Merge from back to avoid overwriting elements in nums1.
// Place the larger element (nums1[i] or nums2[j]) at position k.
// No need to handle remaining nums1 elements as they are already in place.
// Only copy remaining nums2 elements if any.
import java.util.ArrayList;
class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        ArrayList<Integer> ans=new ArrayList<>();
        int i=0;
        int j=0;
        while(i<nums1.length && j<nums2.length){
            if(nums1[i]==nums2[j]){
                if(ans.isEmpty() ||ans.get(ans.size()-1)!=nums1[i]){
                ans.add(nums1[i]);
                }
                j++;
                i++;
            }
            else if(nums1[i]<nums2[j]) i++;
            else j++; 
        }
        int[]result=new int[ans.size()];
        for(int k=0; k< ans.size();k++){
            result[k]=ans.get(k);
        }
        return result;

    }
}

// Approach: Two Pointer (after sorting)
//
// 1. Sort both arrays to bring common elements together.
// 2. Use two pointers (i, j) to traverse both arrays.
// 3. If nums1[i] == nums2[j], add it to result (only if it's not a duplicate),
//    then move both pointers.
// 4. If nums1[i] < nums2[j], move i forward.
//    Else move j forward.
// 5. Use a check (ans.isEmpty() || last element != current) to avoid duplicates.
//
// Time Complexity: O(n log n + m log m)
// Space Complexity: O(1) (excluding output)
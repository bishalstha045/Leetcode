class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
     HashSet<Integer> set1= new HashSet<>();
     HashSet<Integer> set2=new HashSet<>();
     List<Integer> list1=new ArrayList<>();
     List<Integer> list2=new ArrayList<>();
     List<List<Integer>> result= new ArrayList<>();
     for(int el:nums1){
        set1.add(el);
     }   
     for(int el:nums2){
        set2.add(el);
     }
     for(int el:set1){
        if(!set2.contains(el))list1.add(el);
     }   
     for(int el:set2){
        if(!set1.contains(el))list2.add(el);
     }
     result.add(list1);   
     result.add(list2);
     return result;   
    }
}
// Approach:
// I used two HashSets to store the unique elements of both arrays, which automatically removes duplicates. Then, I traversed the first set and added the elements that were not present in the second set to the first result list. Similarly, I traversed the second set and added the elements that were not present in the first set to the second result list. Finally, I returned both lists as the answer. This approach runs in O(n + m) time using HashSet's O(1) average lookup.
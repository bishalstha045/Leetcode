class Solution {
    public List<Integer> majorityElement(int[] nums) {
        HashMap<Integer,Integer> map = new HashMap<>();
        List<Integer> ans= new ArrayList<>();
        int n=nums.length;
        int limit=n/3;
        for(int el:nums){
            map.put(el,map.getOrDefault(el,0)+1);
        }
        for(int el:map.keySet()){
             if(map.get(el)>limit){
                ans.add(el);
            }
        }
        return ans;
    }
}

// Approach:
// Use a HashMap to store the frequency of each element in the array. After counting all
// frequencies, iterate through the map and add every element whose frequency is greater
// than n/3 to the answer list. This is a straightforward frequency counting approach.
// Time Complexity: O(n)
// Space Complexity: O(n)
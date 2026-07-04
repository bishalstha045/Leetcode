class Solution {
    public int totalFruit(int[] fruits) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int left=0;
        int maxLen=0;
        for (int right=0;right<fruits.length; right++) {
            map.put(fruits[right],map.getOrDefault(fruits[right],0) +1);
            while (map.size()>2) {
                map.put(fruits[left],map.get(fruits[left]) - 1);
                if (map.get(fruits[left])==0) {
                    map.remove(fruits[left]);
                }
                left++;
            }
            maxLen = Math.max(maxLen,right-left+1);
        }
        return maxLen;
    }
}
// Use a sliding window and keep track of fruit counts using a HashMap.
// Expand the window by moving right and adding fruits to the map.
// If more than 2 fruit types are present, shrink the window from the left
// until only 2 types remain. The largest valid window size is the answer.
// Time Complexity: O(n)
// Space Complexity: O(1) since the map stores at most 3 fruit types.
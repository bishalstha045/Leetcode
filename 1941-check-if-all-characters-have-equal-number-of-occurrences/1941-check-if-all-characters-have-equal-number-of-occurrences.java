class Solution {
    public boolean areOccurrencesEqual(String s) {
      int[]freq= new int[26];
      for(char ch:s.toCharArray()){
        freq[ch-'a']++;
      }
      int count=0;
      for(int f:freq){
        if(f!=0){
            if(count==0)count=f;
            else if(f!=count)return false;
        }
      }
      return true;
    }
}
//using frequency array
// Count the frequency of each character using a frequency array.
// Store the first non-zero frequency, then compare the remaining non-zero
// frequencies with it. If any frequency differs, return false.
// Time Complexity: O(n)
// Space Complexity: O(1)

// class Solution {
//     public boolean areOccurrencesEqual(String s) {
//        HashMap<Character,Integer> map =new HashMap<>();
//        for(char ch:s.toCharArray()){
//         map.put(ch,map.getOrDefault(ch,0)+1);
//        }
//        int freq=0; 
//        for(int count:map.values()){
//         if(freq==0)freq=count;
//         else if(count!=freq)return false;
//        }
//        return true;
//     }
// }
//using Hashmap
// Count the frequency of each character using a HashMap.
// Store the first frequency, then compare all remaining frequencies with it.
// If any frequency differs, return false; otherwise, return true.
// Time Complexity: O(n)
// Space Complexity: O(1)
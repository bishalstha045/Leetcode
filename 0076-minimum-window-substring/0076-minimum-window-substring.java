class Solution {
    public String minWindow(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();// Store frequency of characters required from t
        if(t.length()>s.length())return "";
        for(char ch:t.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int left=0;
        int count=t.length();
        int minlength=Integer.MAX_VALUE;
        int start=0;
        for(int right=0;right<s.length();right++){  // Expand the window
            char ch=s.charAt(right);
            if(map.containsKey(ch)){
                if(map.get(ch)>0){ // This character was still needed
                    count--;
                }
                map.put(ch,map.get(ch)-1);// Include current character in window
            }
            while(count==0){ // Shrink the window while it is valid
                if((right-left+1)<minlength){ // Update answer
                    minlength=right-left+1;
                    start=left;
                }
                char leftremove=s.charAt(left);// Remove character from window
                if(map.containsKey(leftremove)){
                map.put(leftremove,map.get(leftremove)+1);
                if(map.get(leftremove)>0){// Window becomes invalid
                    count++;
                }
                }
            left++;
            }
        }
        return (minlength==Integer.MAX_VALUE)?"":s.substring(start,start+minlength);
    }
}
/*
Approach:
I use the Sliding Window technique with a HashMap to find the minimum valid substring. First, I store the frequency of every character in t, where the map represents how many more characters are still needed. As I expand the window by moving the right pointer, I decrease the frequency of the current character, and if that character was still needed, I also decrease the required count. When the count becomes 0, the current window contains all the required characters. I then update the minimum window by storing its length and starting index. After that, I try to shrink the window from the left to find a smaller valid substring. While removing the leftmost character, I increase its frequency in the map because it is no longer inside the window. If its frequency becomes positive, it means a required character is missing again, so I increase the count and stop shrinking. This process continues until the entire string is traversed, and finally I return the smallest valid substring.
*/

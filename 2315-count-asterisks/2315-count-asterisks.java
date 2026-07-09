class Solution {
    public int countAsterisks(String s) {
        boolean isinside=false;
        int count=0;
        for(char ch:s.toCharArray()){
            if(ch=='|') isinside=!isinside;
            else if(ch=='*' && !isinside)count++;
        }
        return count;
    }
}
// Traverse the string once.
// Toggle a flag whenever '|' appears to know whether we are inside a pair of bars.
// Count '*' only when we are outside the bars.
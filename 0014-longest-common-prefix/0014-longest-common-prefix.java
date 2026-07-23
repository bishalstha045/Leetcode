class Solution {
    public String longestCommonPrefix(String[] strs) {
        String prefix=strs[0];
        for(int i=1;i<strs.length;i++){
            while(!strs[i].startsWith(prefix)){
                prefix=prefix.substring(0,prefix.length()-1);
            }
            if(prefix.isEmpty()){
                return "";
            }
        }
        return prefix;
    }
}
/*
I initialized the first string as the current prefix and compared it with every other string in the array. If a string did not start with the current prefix, I repeatedly removed the last character from the prefix using `substring()` until it matched. If the prefix became empty, I returned an empty string because no common prefix exists. After checking all the strings, I returned the remaining prefix as the longest common prefix.
*/
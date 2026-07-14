class Solution {
    public boolean isIsomorphic(String s, String t) {
        HashMap<Character, Character> map = new HashMap<>();
        HashSet<Character> used = new HashSet<>();
        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);
            if (map.containsKey(c1)) {
                if (map.get(c1) != c2)
                    return false;
            } else {
                if (used.contains(c2))
                    return false;
                map.put(c1, c2);
                used.add(c2);
            }
        }
        return true;
    }
}
// Use a HashMap to store the mapping from each character in s to t.
// A HashSet ensures that each character in t is mapped only once.
// If a character in s is already mapped, it must map to the current
// character in t; otherwise, return false. If it's a new character,
// create the mapping only if the character in t hasn't been used.
// If all mappings remain consistent, the strings are isomorphic.
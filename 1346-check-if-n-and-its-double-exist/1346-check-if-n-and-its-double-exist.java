import java.util.*;

class Solution {
    public boolean checkIfExist(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int num : arr) {
            // check double
            if (set.contains(2 * num)) return true;

            // check half (only if even)
            if (num % 2 == 0 && set.contains(num / 2)) return true;

            set.add(num);
        }

        return false;
    }
}

// Approach:
// Use HashSet to store elements seen so far.
// For each number, check:
// 1. If its double exists in set
// 2. If it's even and its half exists in set
// If either condition is true, return true.
// Otherwise, add number to set.
//
// Time Complexity: O(n)
// Space Complexity: O(n)
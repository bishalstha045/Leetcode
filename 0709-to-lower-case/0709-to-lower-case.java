class Solution {
    public String toLowerCase(String s) {
        char arr[] = s.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i] >='A' && arr[i] <='Z'){
                arr[i] = (char)(arr[i] + 32);
            }
        }
        return new String(arr);
    }
}

// Approach:
// Convert the string into a character array to allow in-place modification.
// Traverse each character:
// - If it lies between 'A' and 'Z', convert it to lowercase by adding 32
//   (since ASCII difference between uppercase and lowercase is 32).
// - Otherwise, leave it unchanged.
// Finally, convert the modified character array back to a string.

// Time Complexity: O(n)
// We traverse the string once.

// Space Complexity: O(n)
// Character array is used to store modified result.
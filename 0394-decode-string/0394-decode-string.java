class Solution {
    public String decodeString(String s) {
        Stack<Integer> numStack = new Stack<>();
        Stack<StringBuilder> strStack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        int num = 0;
        for (char ch : s.toCharArray()) {
            if (ch >= '0' && ch <= '9') {
                num = num * 10 + (ch - '0');
            }
            else if (ch == '[') {
                numStack.push(num);
                strStack.push(sb);
                num = 0;
                sb = new StringBuilder();
            }
            else if (ch == ']') {
                int repeat = numStack.pop();
                StringBuilder prev = strStack.pop();
                for (int i = 0; i < repeat; i++) {
                    prev.append(sb);
                }
                sb = prev;
            }
            else {
                sb.append(ch);
            }
        }
        return sb.toString();
    }
}
// We use two stacks: one for numbers and one for the strings before '['.
// Whenever we find a digit, we build the complete number because it tells
// us how many times the string inside the brackets should be repeated.
// When '[' comes, we save the current number and current string, then start
// a new string. Normal characters are simply added to the current string.
// When ']' comes, we get the repeat count and previous string from the stacks,
// repeat the current string, and attach it to the previous string.
// At the end, sb contains the fully decoded string.
class Solution {
    public static String infixToPostfix(String s) {
        Stack<Character> st = new Stack<>();
        String str = "";
        char[] ch = s.toCharArray();
        for (int i = 0; i < ch.length; i++) {
            char c = ch[i];
            // Operand
            if (Character.isLetterOrDigit(c)) {
                str += c;
            }
            // Opening bracket
            else if (c == '(') {
                st.push(c);
            }
            // Closing bracket
            else if (c == ')') {
                while (!st.isEmpty() && st.peek() != '(') {
                    str += st.pop();
                }
                st.pop();
            }
            // Operator
            else {
                while (!st.isEmpty() && st.peek() != '(' &&
                (precedence(st.peek()) > precedence(c) ||
                (precedence(st.peek()) == precedence(c) && c != '^'))) {
                    str += st.pop();
                }
                st.push(c);
            }
        }
        // Pop remaining operators
        while (!st.isEmpty()) {
            str += st.pop();
        }
        return str;
    }
    public static int precedence(char c) {
        if (c == '^')
            return 3;
        if (c == '*' || c == '/')
            return 2;
        if (c == '+' || c == '-')
            return 1;
        return -1;
    }
}
// I used a stack to convert the infix expression into postfix.
// Operands are directly added to the answer, while operators are
// pushed into the stack based on their precedence. For ')' I pop
// operators until '(' is found. Finally, I pop all remaining operators.
// Time Complexity: O(n), Space Complexity: O(n).

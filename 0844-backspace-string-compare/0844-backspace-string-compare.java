class Solution {
    public boolean backspaceCompare(String s, String t) {
        return method(s).equals(method(t));
    }
    public String method(String s){
        Stack<Character> st=new Stack<>();
        for(char c:s.toCharArray()){
            if(c=='#'){
               if(!st.isEmpty()) st.pop();
            }
            else st.push(c);
        }
        StringBuilder sb=new StringBuilder();
        for(char c:st){
            sb.append(c);
        }
        return sb.toString();
    }
}
// First I build the final string after applying all the backspaces.
// I use a stack where normal characters are pushed and '#' removes
// the last character if the stack is not empty.
// Then I convert the stack into a string and compare the final
// strings of s and t. If both are same, return true.
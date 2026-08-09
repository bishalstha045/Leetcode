// class Solution {
//     public boolean isValid(String s) {
//       Stack<Character> st=new Stack<>();
//       for(char ch:s.toCharArray()){
//         if(ch=='{'||ch=='['||ch=='(') st.push(ch);
//         else{
//             if(st.isEmpty())return false;
//             char top=st.pop();
//             if(
//                 (ch==')' &&top!='(') ||
//                 (ch=='}' &&top!='{') ||
//                 (ch==']' &&top!='[')
//             ) return false;
//         }
//       }
//         return st.isEmpty();
//     }
// }
/*
I used a Stack because brackets follow LIFO. I push opening brackets and for every closing bracket, I check whether it matches the top of the stack. If it doesn't match or the stack is empty, I return false. Finally, the stack should be empty. Time: O(n), Space: O(n).
*/

class Solution {
    public boolean isValid(String s) {
      Stack<Character> st=new Stack<>();
      HashMap<Character,Character> ans= new HashMap<>();
      ans.put(')','(');
      ans.put('}','{');
      ans.put(']','[');
      for(char ch:s.toCharArray()){
        if(ans.containsKey(ch)){
            if(st.isEmpty()||st.pop()!=ans.get(ch)) return false;
        }
        else st.push(ch);
      }
      return st.isEmpty();
    }
}
/*
I used a HashMap to store the matching opening bracket for each closing bracket. Opening brackets are pushed into the stack, and for closing brackets I compare the top with the mapped value. If they don't match, I return false. At the end, the stack must be empty. Time: O(n), Space: O(n).
 */
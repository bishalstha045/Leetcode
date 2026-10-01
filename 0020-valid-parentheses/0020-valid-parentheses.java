class Solution {
    public boolean isValid(String s) {
      Stack<Character> st=new Stack<>();
      for(char ch:s.toCharArray()){
        if(ch=='{'||ch=='['||ch=='(') st.push(ch);
        else{
            if(st.isEmpty())return false;
            char top=st.pop();
            if(
                (ch==')' &&top!='(') ||
                (ch=='}' &&top!='{') ||
                (ch==']' &&top!='[')
            ) return false;
        }
      }
        return st.isEmpty();
    }
}
// class Solution {
//     public boolean isValid(String s) {
//       Stack<Character> st=new Stack<>();
//       HashMap<Character,Character> ans= new HashMap<>();
//       ans.put(')','(');
//       ans.put('}','{');
//       ans.put(']','[');
//       for(char ch:s.toCharArray()){
//         if(ans.containsKey(ch)){
//             if(st.isEmpty()||st.pop()!=ans.get(ch)) return false;
//         }
//         else st.push(ch);
//       }
//       return st.isEmpty();
//     }
// }
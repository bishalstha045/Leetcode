class Solution {
    public String simplifyPath(String path) {
        String []arr=path.split("/");
        Stack<String> st=new Stack<>();
        for(String s:arr){
            if(s.equals("") || s.equals("."))continue;
            if(s.equals("..")){
                if(!st.isEmpty())st.pop();
            }
            else st.push(s);
        }
        StringBuilder sb=new StringBuilder();
        for(String s:st){
            sb.append("/").append(s);
        }
        return sb.length()==0?"/":sb.toString();
    }
}
/*
I used a stack to simplify the path. First, I split the path using / and processed each part one by one. Empty strings and . are ignored because they don't change the current location. When I get .., I pop the last directory from the stack because it means going one directory back. Otherwise, I push the directory into the stack. Finally, I use a StringBuilder to construct the simplified path by adding / before every directory. If the stack is empty, I return /.

 */
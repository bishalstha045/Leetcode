class Solution {
    public String toLowerCase(String s) {
        StringBuilder sc = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch>='A' && ch <='Z'){
                ch= (char)(ch + 32);
            }
            sc.append(ch);
        }
        return sc.toString();
    }
}

// approach
// firstly we created a string builder object to store our lowercase letters
// we traverse in the string array then we know uppercase and lowercase letter are differ by 32 ascii value 
// for A =65 and a= 97
// then we compare if letter are in between A and Z if so then we converted it into lowercase letters using ascii value
// and while returning we have to put toString since stringbuilder is an object

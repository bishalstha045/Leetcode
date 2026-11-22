class Solution {
    public boolean checkString(String s) {
        boolean found_b= false;
        for(char ch:s.toCharArray()){
            if(ch=='b')found_b=true;
            else if(ch=='a'){
                if(found_b==true)return false;
            }
        }
        return true;
    }
}
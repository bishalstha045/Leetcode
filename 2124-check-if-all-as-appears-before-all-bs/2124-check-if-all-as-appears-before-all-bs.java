// class Solution {
//     public boolean checkString(String s) {
//         return !s.contains("ba");
//     }
// }

/*
Check whether the string contains "ba".
If "ba" exists, an 'a' appears after a 'b', so return false.

Otherwise, return true.
 */
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
/*
Track whether 'b' has appeared using a boolean variable.
If 'a' appears after 'b', return false.
Otherwise, return true.
 */
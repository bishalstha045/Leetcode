import java.util.Collections;
import java.util.ArrayList;
class Solution {
    public int[] plusOne(int[] digits) {
        ArrayList<Integer> ans= new ArrayList<>();
        int n=digits.length;
        int carry=1;
        for(int i=n-1;i>=0;i--){
            if(digits[i]+carry !=10){
                ans.add(digits[i]+carry);
                carry=0;
            }
            else{
                ans.add(0);
                carry=1;
            }
        }
        if(carry==1){
            ans.add(carry);
        }
        Collections.reverse(ans);
        int []result = new int[ans.size()];
        for(int j=0;j<ans.size();j++){
            result[j]=ans.get(j);
        }
        return result;
    }
}
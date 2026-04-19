import java.util.Collections;
class Solution {
    public List<Integer> addToArrayForm(int[] num, int k) {
        ArrayList<Integer> ans= new ArrayList<>();
        int i=num.length -1;
        while(i>=0 || k>0){  //until carry is less then 0 
            if(i>=0){  // it means until all elements of array are processed
            k+=num[i];  //added each digt in k , k is acting as an carry
            i--;
            }
            ans.add(k%10);  // added the remainder of carry that is last element
            k/=10; // last digit of carry is already added in list so we have new carry
        }
        Collections.reverse(ans); // since we added from last so in list it contains element from last to first but we need elements from first to last 
        return ans;        
    }
}

// Traverse array from right to left, add each digit to k (acting as carry)
// Extract last digit using k % 10 and store in result
// Update k by dividing by 10
// Continue until both array and k are processed, then reverse result
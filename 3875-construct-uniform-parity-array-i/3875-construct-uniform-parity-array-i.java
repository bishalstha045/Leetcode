class Solution {
    public boolean uniformArray(int[] nums) {
        return true;
    }
}
 /*
We can always make all elements have the same parity. If all
elements are already odd or all are even, we can simply keep
the original values. If both odd and even numbers are present,
we can subtract another element with the required opposite
parity to make the result odd, while keeping the elements that
already have the desired parity. Therefore, it is always
possible to construct nums2 with all elements having the same
parity, so we return true.
        */
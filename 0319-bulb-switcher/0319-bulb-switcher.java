class Solution {
    public int bulbSwitch(int n) {
        int count =0;
        int i =1;
        while(i*i <=n){
            count ++;
            i++;
        }
        return count;
    }
}


// Each bulb is toggled once for every divisor it has.
// Bulbs with even number of divisors end OFF, odd end ON.
// Only perfect squares have odd number of divisors.

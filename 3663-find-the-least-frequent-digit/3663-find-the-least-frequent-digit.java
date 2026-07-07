class Solution {
    public int getLeastFrequentDigit(int n) {
        int []freqarr=new int [10];
        while(n!=0){
            int digit=n%10;
            freqarr[digit]++;
            n/=10;
        }
        int minfreq=Integer.MAX_VALUE;
        int ans=-1;
        for(int i=0;i<10;i++){
            int freq=freqarr[i];
            if(freqarr[i]>0 && freq< minfreq){
                minfreq=freq;
                ans=i;
            }
        }
        return ans;
    }
}
/*
Approach:
Create a frequency array of size 10 to store the count of each digit. Traverse the number by extracting one digit at a time using the modulo operator and increment its frequency. Once all digits are counted, iterate through the frequency array from 0 to 9 and keep track of the digit with the smallest non-zero frequency. Since the traversal is in increasing order, if multiple digits have the same minimum frequency, the smallest digit is returned automatically.
Time Complexity: O(log n)
Space Complexity: O(1)
*/
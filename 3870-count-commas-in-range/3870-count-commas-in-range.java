class Solution {
    public int countCommas(int n) {
        if(n<1000)return 0;
        else return n-999;
    }
}
/*
since quesiton is asking for number of commas for each integer between 1 to n
and we know that from 1 to 999 there is no comma used in an integer after that 
commas is used
 */
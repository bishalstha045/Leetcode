class Solution {
    public int romanToInt(String s) {
        int total=0;
        for(int i=0;i<s.length()-1;i++){
            char cur = s.charAt(i);
            char next= s.charAt(i+1);
            if(value(cur)<value(next)){
                total -= value(cur);
            }
            else{
                 total += value(cur);
            }
        }
         total += value(s.charAt(s.length() - 1)); //since the last element of roman numeral is never subtracted thats why i have simply added this
        return total;

    }
    //converting symbol into values
    public int value(char ch){
        if(ch=='I') return 1;
        else if(ch=='V') return 5;
        else if(ch=='X') return 10;
        else if(ch=='L') return 50;
        else if(ch=='C') return 100;
        else if(ch=='D') return 500;
        else  return 1000;
    }
}

/*
so basically i created a return type function value which will convert the roman values into the number values ,
then i simply travese through each character of the string and i checked current element with next element so for that to avoid array out of bound i have gone for second last element in loop condition 
i subtracted element if current element is smaller than the previous element but if not then i simply added 
this goes till the last element but for last element i simply added it outside of the loop 
 */
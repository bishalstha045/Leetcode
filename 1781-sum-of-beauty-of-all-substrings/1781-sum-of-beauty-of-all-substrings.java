class Solution {
    public int maxcount(int freq[]){
        int count= Integer.MIN_VALUE;
        for(int i =0; i<26;i++){
            count=Math.max(count, freq[i]);
        }
        return count;
    }
    public int mincount(int freq[]){
        int count= Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                count= Math.min(count,freq[i]);
            }
        }
        return count;
    }
    public int beautySum(String s) {
       int sum=0;
        for(int i=0;i<s.length();i++){
            int []freq =new int[26];
            for(int j=i;j<s.length(); j++){
                char ch = s.charAt(j);
                freq[ch - 'a']++;
                int beauty = maxcount(freq) - mincount(freq);
                sum+=beauty;
            }
        }
        return sum;
    }
}

// For every substring:
// 1. Keep track of character frequencies.
// 2. Find the highest and lowest non-zero frequency.
// 3. Beauty = max frequency - min frequency.
// 4. Add beauty of each substring to the final sum.

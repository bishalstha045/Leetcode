class Solution {
    public String getHint(String secret, String guess) {
        int bulls = 0;
        int cows = 0;
        int[] freq = new int[10];
        // Count bulls and store remaining secret digits
        for (int i = 0; i < secret.length(); i++) {
            if (secret.charAt(i) == guess.charAt(i)) {
                bulls++;
            } else {
                freq[secret.charAt(i) - '0']++;
            }
        }
        // Count cows
        for (int i = 0; i < guess.length(); i++) {
            if (secret.charAt(i) != guess.charAt(i)) {
                int digit = guess.charAt(i) - '0';

                if (freq[digit] > 0) {
                    cows++;
                    freq[digit]--;
                }
            }
        }
        return bulls + "A" + cows + "B";
    }
}
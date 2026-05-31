class Solution {
public:
    string getHint(string secret, string guess) {
        int bulls = 0, cows = 0;
        vector<int> cntS(10, 0), cntG(10, 0);

        for (int i = 0; i < secret.size(); i++) {
            if (secret[i] == guess[i]) {
                bulls++;
            } else {
                cntS[secret[i] - '0']++;
                cntG[guess[i] - '0']++;
            }
        }

        for (int d = 0; d < 10; d++) {
            cows += min(cntS[d], cntG[d]);
        }

        return to_string(bulls) + "A" + to_string(cows) + "B";
    }
};
// Count bulls directly when digits match at the same position.
// For non-bull digits, store their frequencies in secret and guess.
// Cows are the common digits between these frequency counts.
// Return result in the format "xAyB".
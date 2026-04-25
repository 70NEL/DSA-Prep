class Solution {
    public int characterReplacement(String s, int k) {
        char[] count = new char[26];
        int maxLength = 0;
        int l=0; int maxFreq = 0;

        for(int r=0; r<s.length(); r++) {
            count[s.charAt(r) - 'A']++;

            maxFreq = Math.max(count[s.charAt(r) - 'A'],maxFreq);

            if((r-l+1) - maxFreq > k) {
                count[s.charAt(l) - 'A']--;
                l++;
            }

            maxLength = Math.max(r-l+1, maxLength);
        }

        return maxLength;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> setOfChars = new HashSet<>();
        int l=0;
        int r=0;
        int maxLength = 0;
        while(r < s.length()) {
            while (!setOfChars.add(s.charAt(r))) {
                setOfChars.remove(s.charAt(l));
                l++;
            }
            
            maxLength = Math.max(maxLength, setOfChars.size());
            r++;
        }

        return maxLength;
    }
}
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Set<Character> setOfChars = new HashSet<>();
        int l=0;
        int r=0;
        int maxLength = 0;//"zxyzxyz"
        int length = 0;
        while(r < s.length()) {
            while (!setOfChars.add(s.charAt(r))) {
                setOfChars.remove(s.charAt(l));
                l++;
                length--;
            }
            length = setOfChars.toArray().length;
            if(length > maxLength) {
                maxLength = length;
            }
            r++;
        }
        
        return maxLength;
    }
}

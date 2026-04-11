class Solution {
    public boolean isAnagram(String s, String t) {
        char[] countS = new char[26];
        char[] countT = new char[26];

        for(int i=0; i<s.length(); i++) {
            countS[s.charAt(i) - 'a']++;
        }

        for(int i=0; i<t.length(); i++) {
            countT[t.charAt(i) - 'a']++;
        }
        
        for(int i=0; i<26; i++) {
            if(countS[i] != countT[i]) {
                return false;
            }
        }

        return true;
    }
}

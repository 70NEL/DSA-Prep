class Solution {
    public boolean isAnagram(String s, String t) {
        HashMap<Character, Integer> freqMap = new HashMap<>();
        for(int i=0; i<s.length();i++) {
            Character c = s.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c,0) + 1);
        }
        
        for(int i=0; i<t.length();i++) {
            Character c = t.charAt(i);
            freqMap.put(c, freqMap.getOrDefault(c,0) - 1);
        }
        
        for(Map.Entry<Character, Integer> e : freqMap.entrySet()) {
            if(e.getValue() != 0) {
                return false;
            }
        }
        return true;
    }
}
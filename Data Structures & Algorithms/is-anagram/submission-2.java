class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();

        for(int i=0; i<s.length(); i++) {
            if(map1.containsKey(s.charAt(i))) {
                map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
            }else {
                map1.put(s.charAt(i), 1);
            }
            if(map2.containsKey(t.charAt(i))) {
                map2.put(t.charAt(i), map2.get(t.charAt(i)) + 1);
            }else {
                map2.put(t.charAt(i), 1);
            }
        }
        
        if(map1.size() >= map2.size()) {
            for(Map.Entry<Character, Integer> entry : map1.entrySet()) {
                if(!Objects.equals(entry.getValue(), map2.get(entry.getKey()))) {
                    return false;
                }
            }
        }else {
            for(Map.Entry<Character, Integer> entry : map2.entrySet()) {
                if(!Objects.equals(entry.getValue(), map1.get(entry.getKey()))) {
                    return false;
                }
            }
        }
        
        
        return true;
    }
}
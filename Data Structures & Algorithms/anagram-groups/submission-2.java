class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String word: strs) {
            int[] freq = new int[26];
            for(int i=0; i<word.length(); i++) {
                char c = word.charAt(i);
                freq[c-'a']++;
            }
            List<String> lista = map.getOrDefault(Arrays.toString(freq), new ArrayList<>());
            lista.add(word);
            map.put(Arrays.toString(freq), lista);
        }

        List<List<String>> ans = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry: map.entrySet()) {
            List<String> list = entry.getValue();
            ans.add(list);
        }

        return ans;
    }
}
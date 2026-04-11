class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();
        List<List<String>> res = new ArrayList<>();

        for(int i=0; i<strs.length; i++) {
            char[] count = new char[26];
            for(int j=0; j<strs[i].length(); j++) {
                count[strs[i].charAt(j) - 'a']++;
            }
            String temp = Arrays.toString(count);
            
            if(map.containsKey(temp)) {
                List<String> lista = map.get(temp);
                lista.add(strs[i]);
                map.put(temp, lista);
            }else {
                List<String> lista = new ArrayList<>();
                lista.add(strs[i]);
                map.put(temp, lista);
            }
        }

        for(Map.Entry<String, List<String>> entry : map.entrySet()) {
            res.add(entry.getValue());
        }

        return res;
    }
}

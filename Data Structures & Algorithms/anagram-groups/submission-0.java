class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(int i=0; i<strs.length; i++) {
            int[] arr = new int[26];
            for(int j=0; j<strs[i].length(); j++) {
                arr[strs[i].charAt(j)-'a']++;
            }
            List<String> list = map.getOrDefault(Arrays.toString(arr), new ArrayList<>());
            list.add(strs[i]);
            map.put(Arrays.toString(arr), list);
        }

        List<List<String>> res = new ArrayList<>();
        for(Map.Entry<String, List<String>> entry: map.entrySet()) {
            List<String> list = entry.getValue();
            Collections.sort(list);
            res.add(list);
        }

        return res;
    }
}

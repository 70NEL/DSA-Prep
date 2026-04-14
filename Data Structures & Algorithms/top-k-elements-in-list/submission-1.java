class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> freqMap = new HashMap<>();
        for(int nr : nums) {
            freqMap.put(nr, freqMap.getOrDefault(nr, 0) + 1);
        }


        PriorityQueue<Map.Entry<Integer,Integer>> pq = new PriorityQueue<>((a, b)->Integer.compare(b.getValue(), a.getValue()));
        pq.addAll(freqMap.entrySet());
        int[] res = new int[k];

        for(int i=0; i<k; i++) {
            res[i] = pq.poll().getKey();
        }
        
        return res;
    }
}
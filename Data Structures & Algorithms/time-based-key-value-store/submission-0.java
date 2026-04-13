class TimeMap {
    HashMap<String, List<Pair>> map;
    
    public TimeMap() {
        map = new HashMap<>();
    }
    
    public void set(String key, String value, int timestamp) {
        map.putIfAbsent(key, new ArrayList<>());
        map.get(key).add(new Pair(timestamp, value));
    }
    
    public String get(String key, int timestamp) {
        if(!map.containsKey(key)) return "";

        List<Pair> list = map.get(key);
        int l = 0;
        int r = list.size() - 1;
        String result = "";

        while(l<=r) {
            int mij = (l+r)/2;
            if(list.get(mij).timestamp <= timestamp) {
                result = list.get(mij).value;
                l = mij+1;
            }else {
                r = mij-1;
            }
        }
        return result;
    }

    static class Pair{
        int timestamp;
        String value;

        Pair(int t, String v){
            timestamp=t;
            value=v;
        }
    }
}

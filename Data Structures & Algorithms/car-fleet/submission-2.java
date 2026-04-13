class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int[][] cars = new int[position.length][2];

        for (int i = 0; i < position.length; i++) {
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, Comparator.comparingInt(o -> o[0]));
        Deque<Double> q = new ArrayDeque<>();

        for (int i = position.length - 1; i >= 0; i--) {
            Double time = (double) (target - cars[i][0])/cars[i][1];
            if(!q.isEmpty() && q.peek() >= time) {
                continue;
            }else {
                q.addFirst(time);
            }
        }
        return q.size();
    }
}
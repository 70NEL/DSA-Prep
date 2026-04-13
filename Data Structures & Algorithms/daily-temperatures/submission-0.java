class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        Deque<int[]> stack = new ArrayDeque<>();
        int[] res = new int[temperatures.length];

        for(int i=0; i<temperatures.length; i++) {
            while(!stack.isEmpty() && temperatures[i] > stack.peekLast()[0]) {
                int temp = stack.peekLast()[0];
                int pos = stack.peekLast()[1];
                res[pos] = i - pos;
                stack.pollLast();
            }

            stack.addLast(new int[]{temperatures[i], i});
        }
        return res;
    }
}
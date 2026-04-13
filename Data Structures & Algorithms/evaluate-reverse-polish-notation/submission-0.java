class Solution {
    public int evalRPN(String[] tokens) {
        Deque<Integer> queue = new ArrayDeque<>();
        int result = 0;
        for(String c : tokens) {
            if(c.equals("+") || c.equals("-") || c.equals("*") || c.equals("/")) {
                Integer b = queue.pollLast();
                Integer a = queue.pollLast();
                switch(c) {
                    case "+" : queue.addLast(a+b);break;
                    case "-" : queue.addLast(a-b);break;
                    case "*" : queue.addLast(a*b);break;
                    case "/" : queue.addLast(a/b);break;
                }
            }else {
                queue.addLast(Integer.parseInt(c));
            }
        }
        return queue.pollLast();
    }
}
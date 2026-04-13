class Solution {
    public boolean isValid(String s) {
        Deque<Character> queue = new ArrayDeque<>();
        for(int i=0; i<s.length(); i++) {
            if(s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{') {
                queue.addLast(s.charAt(i));
            }else if(!queue.isEmpty()) {
                switch (s.charAt(i)) {
                    case ')' : if (queue.peekLast() != '(') {
                        return false;
                    }break;
                    case ']' : if(queue.peekLast() != '[') {
                        return false;
                    }break;
                    case '}' : if(queue.peekLast() != '{') {
                        return false;
                    }break;
                }
                queue.pollLast();
            }else {
                return false;
            }
        }
        return queue.isEmpty();
    }
}

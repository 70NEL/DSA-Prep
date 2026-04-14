class Solution {
    public int maxArea(int[] heights) {
        int res = Integer.MIN_VALUE;

        int st = 0;
        int dr = heights.length - 1;

        while(st<dr) {
            int tempH = Math.min(heights[st], heights[dr]);
            res = Math.max(res, tempH * (dr-st));
            if(heights[st] < heights[dr]) {
                st++;
            }else {
                dr--;
            }
        }

        return res;
    }
}

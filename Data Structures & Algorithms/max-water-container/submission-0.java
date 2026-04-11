class Solution {
    public int maxArea(int[] heights) {
        int res = Integer.MIN_VALUE;
        int l = 0;
        int r = heights.length - 1;
        while(l < r) {
            if(res < (Integer.min(heights[l], heights[r]) * (r - l))) {
                res = Integer.min(heights[l], heights[r]) * (r - l);
            }
            if(heights[r] > heights[l]) {
                l++;
            }else {
                r--;
            }
        }
        return  res;
    }
}
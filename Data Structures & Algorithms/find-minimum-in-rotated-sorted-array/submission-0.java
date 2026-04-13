class Solution {
    public int findMin(int[] nums) {
        int st = 0;
        int dr = nums.length - 1;
        int res = Integer.MAX_VALUE;

        while(st<=dr) {
            int mij = (st+dr)/2;
            if(st == dr) {
                res = Math.min(res,nums[st]);
                break;
            }
            else if(nums[st] > nums[dr] && nums[mij] > nums[dr]) {
                res = Math.min(res,nums[dr]);
                dr--;
                st = mij+1;
            }else if(nums[st] > nums[dr] && nums[mij] < nums[dr]) {
                res = Math.min(res,nums[mij]);
                st++;
                dr = mij-1;
            }else if(nums[st] < nums[dr]) {
                res = Math.min(res,nums[st]); // 1 2 3 4 5
                break;
            }
        }

        return res;
    }
}

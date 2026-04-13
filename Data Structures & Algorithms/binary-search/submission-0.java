class Solution {
    public int search(int[] nums, int target) {
        int st = 0;
        int dr = nums.length-1;
        while (st<=dr) {
            int mij = (st+dr)/2;
            if(nums[mij] == target) {
                return mij;
            }else if(nums[mij] < target) {
                st = mij+1;
            }else if(nums[mij] > target){
                dr = mij-1;
            }
        }

        return -1;
    }
}

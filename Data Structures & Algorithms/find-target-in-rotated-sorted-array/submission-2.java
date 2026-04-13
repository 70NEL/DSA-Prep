class Solution {
    public int search(int[] nums, int target) {
        int st = 0;
        int dr = nums.length - 1;
        int index = -1;

        while(st<=dr) {
            int mij = (st+dr)/2;
            if(target == nums[mij]) {
                index = mij;
                break;
            }

            if(nums[mij] < nums[dr]) {
                if(target > nums[mij] && target <= nums[dr]) {
                    st = mij+1;
                }else {
                    dr = mij-1;
                }
            }else {
                if(target >= nums[st] && target < nums[mij] ) {
                    dr = mij - 1;
                }else {
                    st = mij + 1;
                }
            }
            
        }
        return index;
    }
}

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        if(nums == null || nums.length<1) {
            return res;
        }
        Arrays.sort(nums);

        for(int i=0; i<nums.length-2; i++) {
            if(i>0 && nums[i] == nums[i-1]) {
                continue;
            }
            int first = i+1;
            int last = nums.length - 1;
            while(first<last) {
                if(nums[first] + nums[last] == -nums[i]) {
                    List<Integer> temp = new ArrayList<>();
                    temp.add(nums[i]);
                    temp.add(nums[first]);
                    temp.add(nums[last]);
                    while(first < last && nums[first] == nums[first+1]) first++;
                    while(first < last && nums[last] == nums[last-1]) last--;
                    first++;
                    last--;
                    res.add(temp);
                }else if(nums[first] + nums[last] < -nums[i]) {
                    first++;
                }else {
                    last--;
                }
            }
        }

        return res;
    }
}

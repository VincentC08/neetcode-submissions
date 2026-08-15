class Solution {
    public boolean hasDuplicate(int[] nums) {
        //O(n^2)
        // for (int i = 0; i < nums.length - 1; i++) {
        //     for (int j = i+1; j < nums.length; j++) {
        //         if (nums[i] == nums[j])
        //             return true;
        //     }
        // }
        // return false;

        //O(nlogn)
        Arrays.sort(nums);
        if (nums.length < 2)
            return false;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i - 1] == nums[i])
                return true;
        }
        return false;
    }
}
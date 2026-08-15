class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int index;
        for (int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if (map.containsKey(complement)) {
                index = map.get(complement);
                if (i < index)
                    return new int[]{i, index};
                else
                    return new int[]{index, i};
            }
            map.put(nums[i], i);
        }
        return new int[]{};
    }
}

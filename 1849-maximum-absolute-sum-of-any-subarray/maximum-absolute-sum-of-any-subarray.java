class Solution {
    public int maxAbsoluteSum(int[] nums) {

        int maxend = nums[0];
        int minend = nums[0];
        int result = Math.abs(nums[0]);

        for (int i = 1; i < nums.length; i++) {

            maxend = Math.max(nums[i], maxend + nums[i]);

            minend = Math.min(nums[i], minend + nums[i]);

            result = Math.max(result, Math.max(maxend, Math.abs(minend)));
        }

        return result;
    }
}
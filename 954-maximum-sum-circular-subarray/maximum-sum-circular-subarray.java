class Solution {
    public int maxSubarraySumCircular(int[] nums) {

        int totalSum = nums[0];

        int maxEnd = nums[0];
        int maxSum = nums[0];

        int minEnd = nums[0];
        int minSum = nums[0];

        for (int i = 1; i < nums.length; i++) {

            totalSum += nums[i];

            // Kadane for maximum subarray
            maxEnd = Math.max(nums[i], maxEnd + nums[i]);
            maxSum = Math.max(maxSum, maxEnd);

            // Kadane for minimum subarray
            minEnd = Math.min(nums[i], minEnd + nums[i]);
            minSum = Math.min(minSum, minEnd);
        }

        // If all numbers are negative
        if (maxSum < 0) {
            return maxSum;
        }

        // Maximum of normal and circular subarray
        return Math.max(maxSum, totalSum - minSum);
    }
}
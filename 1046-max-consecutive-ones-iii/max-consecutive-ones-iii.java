class Solution {

    public int find(int[] frq) {

        return frq[0];   // number of zeros
    }

    public int longestOnes(int[] nums, int k) {

        int[] frq = new int[2];

        int len = 0;
        int diff = 0;

        int left = 0;
        int right = 0;

        int maxlen = 0;

        while (right < nums.length) {

            // Add element to window
            frq[nums[right]]++;

            // Number of zeros in window
            int maxcount = find(frq);

            len = right - left + 1;

            diff = maxcount;

            // Too many zeros
            while (diff > k) {

                frq[nums[left]]--;

                left++;

                maxcount = find(frq);

                len = right - left + 1;

                diff = maxcount;
            }

            maxlen = Math.max(maxlen, len);

            right++;
        }

        return maxlen;
    }
}
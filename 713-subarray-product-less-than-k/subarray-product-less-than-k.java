        

// WRITERN BY ME


// class Solution {
//     public int numSubarrayProductLessThanK(int[] nums, int k) {

//         if (k <= 1) {
//             return 0;
//         }

//         int count = 0;

//         for (int i = 0; i < nums.length; i++) {

//             int p = 1;

//             for (int j = i; j < nums.length; j++) {

//                 p *= nums[j];

//                 if (p < k) {
//                     count++;
//                 } else {
//                     break;
//                 }
//             }
//         }

//         return count;
//     }
// }
class Solution {
    public int numSubarrayProductLessThanK(int[] nums, int k) {

        if (k <= 1) {
            return 0;
        }

        int left = 0;
        int product = 1;
        int count = 0;

        for (int right = 0; right < nums.length; right++) {

            product *= nums[right];

            while (product >= k) {
                product /= nums[left];
                left++;
            }

            count += right - left + 1;
        }

        return count;
    }
}
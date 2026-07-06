class Solution {
   public int findDuplicate(int[] nums) {
       int cout [] = new int[nums.length];
      for(int i=0; i<nums.length; i++){
           cout[nums[i]]++;
          if(cout[nums[i]]==2){
                return nums[i];
            }
        }
       return -1;
    }
}

// class Solution {
//     public int findDuplicate(int[] nums) {

//         int slow = nums[0];
//         int fast = nums[0];

//         // Step 1: Find meeting point
//         do {
//             slow = nums[slow];
//             fast = nums[nums[fast]];
//         } while (slow != fast);

//         // Step 2: Find entrance of cycle
//         slow = nums[0];

//         while (slow != fast) {
//             slow = nums[slow];
//             fast = nums[fast];
//         }

//         return slow;
//     }
// }
// class Solution {
//     public int[] sortArrayByParity(int[] nums) {

//         int j = 0;

//     for(int i = 0; i < nums.length; i++){

        

        

       

        

//         if(nums[i] % 2 == 0 ){

//             int temp = nums[i];
//               nums[i] = nums[j];
//               nums[j] = temp;
//              j++;
//         }

//     }


//         return nums;
//     }
//  }
class Solution {
    public int[] sortArrayByParity(int[] nums) {

        int left = 0;
        int right = nums.length - 1;

        while (left < right) {

            if (nums[left] % 2 == 0) {
                left++;
            } 
            else if (nums[right] % 2 != 0) {
                right--;
            } 
            else {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;

                left++;
                right--;
            }
        }

        return nums;
    }
}
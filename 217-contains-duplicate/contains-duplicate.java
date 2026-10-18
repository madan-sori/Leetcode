class Solution {
    public boolean containsDuplicate(int[] nums) {
        int n = nums.length;
        Set<Integer> st=new HashSet<>();
        for(int i=0;i<n;i++)
        {
            if(!st.contains(nums[i]))
            {
                st.add(nums[i]);
            }
            else
            {
                return true;
            }
        }
        return false;





        // Arrays.sort(nums);
        // for(int i=1;i<n;i++)
        // {
        //     if(nums[i]==nums[i-1])
        //     {
        //         return true;
        //     }
        // }
        // return false;





        // int n = nums.length;
        // for(int i = 0; i<n; i++){
        //     for(int j=i+1; j<n; j++){
        //         if(nums[i] == nums[j]){
        //             return true;
        //         }
        //     }
        // }
        // return false;
    }
}
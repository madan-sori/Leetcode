class Solution {
    public int[] shuffle(int[] nums, int n) {

        ArrayList<Integer> X = new ArrayList<>();
        ArrayList<Integer> y = new ArrayList<>();
        int[] ans = new int[2 * n];

        for(int i = 0; i < nums.length; i++){

            if( i < n){

                X.add(nums[i]);
            }else{

                y.add(nums[i]);

            }



        }
        for(int i = 0; i < n; i++){

            ans[2*i] = X.get(i);
            ans[2*i + 1] = y.get(i);

        }
        
        return ans;
    }
}
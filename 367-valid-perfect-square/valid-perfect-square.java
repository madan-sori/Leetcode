class Solution {
    public boolean isPerfectSquare(int num) {

        if(num == 1){
          return true;

        }
        int n = num/2;
        for(int i = 0; i <= n; i++){

            if(i*i == num){
                return true;
            }
        }

        return false;
        
    }
}
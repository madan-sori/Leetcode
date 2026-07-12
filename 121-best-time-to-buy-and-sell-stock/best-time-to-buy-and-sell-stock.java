class Solution {
    public int maxProfit(int[] prices) {
        // int buyprize = Integer.MAX_VALUE;
        // int maxprofit =0;
        // for(int i=0; i<prices.length;i++){
        //    if(buyprize< prices[i]){
        //     int profit = prices[i]- buyprize;
        //      maxprofit = Math.max(profit , maxprofit);
        //    }else{
        //     buyprize=prices[i];
        //    }
        // }
        //    return maxprofit;
        int minPrices = Integer.MAX_VALUE; 

        int profit = 0 ; 

        for(int i = 0;  i < prices.length; i++){

            if(prices[i] < minPrices){
                minPrices = prices[i];
            }else{
                profit = Math.max(profit , prices[i] - minPrices);
            }
           

        }
         return profit;


        }
    }
   


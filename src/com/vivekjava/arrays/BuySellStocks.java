package com.vivekjava.arrays;

public class BuySellStocks {

    //n log(n)
    public static void buySellStock(int[] prices){
        int buyPrice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for (int i = 0; i < prices.length ; i++) {
            if(buyPrice < prices[i]){
               int profit = prices[i] - buyPrice;
               maxProfit = Math.max(profit,maxProfit);
            }else{
                buyPrice= prices[i];
            }
        }
        System.out.println(maxProfit);







//        int buyIndex = 0;
//        for (int i = 0; i < prices.length; i++) {
//            if(prices[i] < prices[buyIndex]){
//                buyIndex = i;
//            }
//        }
//
//        int sellIndex = -1;
//        for (int i = buyIndex; i < prices.length; i++) {
//            if(prices[i] > prices[buyIndex]){
//                sellIndex = i;
//            }
//        }
//        if(sellIndex==-1){
//            System.out.println("no profit");
//            return;
//        }
//        int profit= prices[sellIndex] - prices[buyIndex];
//        System.out.println(profit);

    }


    public static void main(String[] args) {
//        int[] priceTataPower = {210, 200, 32, 250, 150, 195, 151};
        int[] priceTataPower = {10,7, 5, 4, 3, 15, 1,20,40};
        buySellStock(priceTataPower);
    }
}

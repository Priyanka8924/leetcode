class Solution {
    public int maxProfit(int[] prices) {
        int min=Integer.MAX_VALUE;
        int pro=0;
        int max=0;
        for(int i=0;i<prices.length;i++){
            if(prices[i]<min){
                min=prices[i];
            }
            else{
                pro=prices[i]-min;
                if(max<pro){
                    max=pro;
                }

            }
        }
        return max;
    }
}
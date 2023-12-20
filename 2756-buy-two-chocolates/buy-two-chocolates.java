class Solution {
    public int buyChoco(int[] prices, int money) {
        Arrays.sort(prices);
        for(int i = 0;i<prices.length-1;i++){
            int j = i+1;
            if(prices[i]+prices[j]>money)return money;
            else if(prices[i]+prices[j]<money)return money-(prices[i]+prices[j]);
            else return 0;
        }
        return 0;
    }
}
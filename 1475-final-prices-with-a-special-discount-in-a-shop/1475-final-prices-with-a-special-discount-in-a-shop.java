class Solution {
    public int[] finalPrices(int[] prices) {
        int[] ans = new int[prices.length];
      //  ans=prices;
        int j=0;
        for(int i=0;i<prices.length-1;i++){
            j=i+1;
            while(j!=prices.length&& prices[j]>prices[i])
                j++;
            if(j!=prices.length){
                ans[i]=prices[i]-prices[j];
                continue;
            }
            if(j==prices.length)
                ans[i]=prices[i];
        }
    //    System.out.println(j);
        
        ans[prices.length-1]=prices[prices.length-1];
        return ans;
        
    }
}
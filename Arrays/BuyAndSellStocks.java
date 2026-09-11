package Arrays;

public class BuyAndSellStocks{
    public static void buyAndSellStocks(int[] arr){
        int minPurchase = arr[0];
        int maxProfit = 0;
        
        for(int i = 1 ; i<arr.length; i++){
            if(arr[i] - minPurchase>0){
                maxProfit = Math.max(maxProfit, arr[i] - minPurchase);
            }
            
            minPurchase =  Math.min(minPurchase, arr[i]);
        }
        
        
        System.out.println(maxProfit);
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
        int[] arr = {7,1,5,3,6,4};
        buyAndSellStocks(arr);
	}
}
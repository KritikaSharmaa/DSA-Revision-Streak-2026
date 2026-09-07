package Arrays;

public class MaxConsecutiveOnes {
    public static int findConsecutiveOnes(int[] prices) {
        int count = prices[0];
        int maxcount = 0;

        for (int i = 1; i < prices.length; i++) {
            if (count != 0 && prices[i] == 0) {
                maxcount = Math.max(maxcount, count);
                count = 0;
            } else if (prices[i] != 0) {
                count += 1;
            }
        }

        return Math.max(count, maxcount);
    }

    public static void main(String[] args) throws java.lang.Exception {
        int[] prices = {0, 1, 1,1,0,1,1,0,0};
        int result = findConsecutiveOnes(prices);
        System.out.println("result: " + result);
    }
}

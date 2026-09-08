package Arrays;

public class LongestSubArrayPostive {

    //Optimal Solution --> Total time complexity - O(N)+O(N) ~ O(2N) ~O(N)
    public static int LongestSubarrayPositive(int[] arr, int k) {
        int sum = 0;
        int i = 0;
        int j = 0;
        int maxlen = 0;

        while (j < arr.length) { // j moves forward taken O(N)
            sum += arr[j];

            while (sum > k) {   // i moves forward only taken O(N)
                sum -= arr[i];
                i++;
            }

            if (sum == k) {
                maxlen = Math.max(maxlen, j - i + 1);
            }

            j++;

        }

        return maxlen;
    }

    public static void main(String[] args) throws java.lang.Exception {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        int res = LongestSubarrayPositive(arr, 19);
        System.out.println("LongestSubarrayPositive: " + res);

    }
}

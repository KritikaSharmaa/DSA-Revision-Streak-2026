package Arrays;

public class KadaneAlgo {
    public static void MaxSubarraySum(int[] arr) {
        int sum = 0;
        int maxSum = Integer.MIN_VALUE;
        int start = 0;
        int end = 0;
        int tempStart = 0;

        for (int i = 0; i < arr.length; i++) {

            sum += arr[i];

            if (maxSum < sum) {
                end = i;
                maxSum = sum;
                start = tempStart;
            }

            if (sum < 0) {
                sum = 0;
                tempStart = i + 1;
            }

        }

        System.out.println("start: " + start + " --> end: " + end + " --> maxsum: " + maxSum);
    }

    public static void main(String[] args) throws java.lang.Exception {
        //int[] arr = { -2, -3, -1, -2, -3 };
        int[] arr = {-2, -3, 4, -1, -2, 1, 5, -3 };
        MaxSubarraySum(arr);
    }
}
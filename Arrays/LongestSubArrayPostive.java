package Arrays;

import java.util.*;

public class LongestSubArrayPostive {

    // Optimal Solution [2pointer] --> Total time complexity --> O(N)+O(N) ~ O(2N) ~O(N)
    public static int LongestSubarrayPositive(int[] arr, int k) {
        int sum = 0;
        int i = 0;
        int j = 0;
        int maxlen = 0;

        while (j < arr.length) { // j moves forward taken O(N)
            sum += arr[j];

            while (sum > k) { // i moves forward only taken O(N)
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

    //[NOTE]: This is a optimal solution for both positive and negative numbers in the array. The above solution is optimal only for positive numbers in the array scneario. The below solution is for both positive and negative numbers in the array.
    //Better Approach [Hashmap] --> 
    // Total time complexity --> 
    //Average time = O(N) x O(1) ~ O(N)
    //and Worst-case ==> O(N²) under the collision : Due to hash collisions, multiple keys can end up in the same bucket, so get()/containsKey()/put() may need to check up to N elements → O(N).
    //Since this happens inside an N-iteration loop → O(N × N) = O(N²).
    //Space complexity --> O(N) as we are using a hashmap to store the sum and its corresponding index.
    public static int LongestSubarrayPositiveAndNegative(int[] arr, int k) {
        int sum = 0;
        int maxlen = 0;

        HashMap<Integer, Integer> map = new HashMap<>();    //this is an unordered_map in java, which is used to store the sum and its corresponding index. The key is the sum and the value is the index.
        for (int i = 0; i < arr.length; i++) { //time complexity of this loop is O(N) as we are traversing the array once.
            sum += arr[i];

            if (sum == k) {
                maxlen = Math.max(maxlen, i + 1);
            }

            if (!map.containsKey(sum)) { //worst case time complexity of containsKey() is O(N) but average case time complexity is O(1). So, the overall time complexity of this approach is O(N).
                map.put(sum, i);    //Worst case time complexity of put() is O(N) but average case time complexity is O(1). So, the overall time complexity of this approach is O(N).
            }

            if (map.containsKey(sum - k)) { //contains key time complexity is O(1) in average case and O(N) in worst case. So, the overall time complexity of this approach is O(N).
                maxlen = Math.max(maxlen, i - map.get(sum - k)); //worst case time complexity of get() is O(N) but average case time complexity is O(1). So, the overall time complexity of this approach is O(N).
            }
        }

        return maxlen;
    }

    public static void main(String[] args) throws java.lang.Exception {
        int[] arr = { 10, 5, 2, 7, 1, 9 };
        // int res = LongestSubarrayPositive(arr, 19);
        // System.out.println("LongestSubarrayPositive: " + res);
        int resb = LongestSubarrayPositiveAndNegative(arr, 19);
        System.out.println("LongestSubarrayPositive&Negative: " + resb);
    }
}

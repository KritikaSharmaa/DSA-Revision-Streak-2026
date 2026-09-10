package Arrays;

import java.util.*;

public class TwoSum {

    //Optimal Solution [Hashmap] in case when we need to return indicies but if we need to return yes or no then there is a optimal solution which is better then this
    // Total time complexity --> O(N) x O(1) ~ O(N) and in worst case if collisions happen then it can be O(N²) 
    // and space complexity --> O(N) as we are using a hashmap to store the elements of the array.
    public static int[] find2sum(int[] arr, int target) {
        HashMap<Integer, Integer> mpp = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int rem = target - arr[i];

            if (mpp.containsKey(rem)) {
                return new int[] { i, mpp.get(rem) };
            }

            if (!mpp.containsKey(arr[i])) {
                mpp.put(arr[i], i);
            }

        }

        return new int[] { -1, -1 };
    }

    public static String find2SumYesOrNo(int[] arr, int target){
        Arrays.sort(arr); // O(NlogN)
        int left = 0;
        int right = arr.length - 1;

        while(left<right){
            int sum = arr[left] + arr[right];

            if(sum == target){
                return "Yes";
            }
            else if(sum <target){
                left++;
            }
            else{
                right--;    
            }
        }

        return "No";
    }

    public static void main(String[] args) throws java.lang.Exception {
        int[] arr = { 2, 6, 5, 8, 11 };

        int[] res = find2sum(arr, 14);

        System.out.print("TwoSum[Optimal]: When target is 14, the indices of the two numbers that add up to the target are: ");
        for (int k = 0; k < res.length; k++)
            System.out.print(res[k] + " ");

        System.out.println();
        String resYN = find2SumYesOrNo(arr, 14);
        System.out.println("TwoSum[Optimal]: When target is 14, yes or no answer is requested: " + resYN);

    }
}

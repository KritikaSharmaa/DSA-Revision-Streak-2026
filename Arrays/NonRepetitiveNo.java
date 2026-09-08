package Arrays;

import java.util.HashMap;
import java.util.Map;

public class NonRepetitiveNo {
    // Time Complexity O(N) + O(N/2+1) ~ O(N)
    public static Long nonRep_better(int[] arr) {
        // better approach
        Map<Long, Integer> map = new HashMap<>();

        for (long num : arr) {
            map.put(num, map.getOrDefault(num, 0) + 1); // O(1)
        }

        for (Map.Entry<Long, Integer> entry : map.entrySet()) { // O(N/2+1)
            if (entry.getValue() == 1)
                return entry.getKey();
        }

        return 0L;
    }

    public static Long nonRep_optimal(int[] arr){
        // optimal approach
        long xor = 0;
        for (long num : arr) {
            xor ^= num; // XOR operation as a^a = 0 and a^0 = a, so all repetitive numbers will cancel out and we will be left with the non-repetitive number
        }
        return xor;
    }

    public static void main(String[] args) throws java.lang.Exception {
        int[] arr = { 4, 1, 2, 1, 2, 4, 7 };
        Long res = nonRep_better(arr);
        System.out.println("non repetitive number is[Better Approach]: " + res);
        Long reso = nonRep_optimal(arr);
        System.out.println("non repetitive number is[Optimal Approach]: " + reso);
    }
}

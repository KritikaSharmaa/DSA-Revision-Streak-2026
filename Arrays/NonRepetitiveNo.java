package Arrays;

import java.util.HashMap;
import java.util.Map;

public class NonRepetitiveNo {
    // Time Complexity O(N) + O(N/2+1) ~ O(N)
    public static Long nonRep(int[] arr) {
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

    public static void main(String[] args) throws java.lang.Exception {
        int[] arr = { 4, 1, 2, 1, 2, 4, 7 };
        Long res = nonRep(arr);
        System.out.println("non repetitive number is: " + res);
    }
}

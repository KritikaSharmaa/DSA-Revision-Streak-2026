package Arrays;

import java.util.*;

public class UnionArray {

    public static List < Integer > FindUnion(int[] arr1, int[] arr2) {
        int i = 0, j = 0;

        List < Integer > res = new ArrayList < Integer > ();

        while (i < arr1.length && j < arr2.length) {

            if (arr1[i] < arr2[j]) {
                if (res.size() == 0 || res.get(res.size() - 1) != arr1[i])
                    res.add(arr1[i]);
                i++;
            } else if (arr1[i] > arr2[j]) {
                if (res.size() == 0 || res.get(res.size() - 1) != arr2[j])
                    res.add(arr2[j]);
                j++;
            } else if (arr1[i] == arr2[j]) {
                if (res.size() == 0 || res.get(res.size() - 1) != arr1[i])
                    res.add(arr1[i]);
                i++;
                j++;
            }

        }
        
         // Remaining elements from arr1
        while (i < arr1.length) {

            if (res.size() == 0 ||
                res.get(res.size() - 1) != arr1[i]) {

                res.add(arr1[i]);
            }

            i++;
        }

        // Remaining elements from arr2
        while (j < arr2.length) {

            if (res.size() == 0 ||
                res.get(res.size() - 1) != arr2[j]) {

                res.add(arr2[j]);
            }

            j++;
        }
        
        return res;
    }
    public static void main(String[] args) throws java.lang.Exception
    {
        int[] arr1 = {
            1,
            2,
            3,
            4,
            5
        };
        int[] arr2 = {
            2,
            3,
            4,
            4,
            5
        };

        List < Integer > result = FindUnion(arr1, arr2);

        System.out.println("List " + result);
    }
}

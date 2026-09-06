package Arrays;

public class MoveZeroToEnd {
    //Time complexity: O(n) ---> 2 pointers approach
    //Space complexity: O(1)
    public static void moveZeros(int[] arr) {
        int p = 0;
        while (arr[p] != 0) {
            p++;
        }

        System.out.println(p);

        for (int i = p + 1; i < arr.length; i++) {
            if (arr[p] == 0 && arr[i] != 0) {
                arr[p] = arr[i];
                arr[i] = 0;
                p++;
            }
        }

    }

    public static void printArr(int[] arr) {
        for (int i = 0; i < arr.length; i++)
            System.out.print(arr[i] + " ");
    }

    public static void main(String[] args) throws java.lang.Exception {
        int[] arr = { 1, 0, 2, 3, 0, 4, 0, 1 };
        moveZeros(arr);
        printArr(arr);
    }
}

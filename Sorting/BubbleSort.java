package Sorting;

//🫧 Bubble always pushes the biggest element to the surface/end.
//Time Complexity: O(n^2) in worst case, O(n) in best case as we optimised our code to break if no swaps are made in a pass.
public class BubbleSort {

    public static void selectionSort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            boolean swapped = false;
            for (int j = 0; j < arr.length - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;

                    swapped = true;
                }
            }
            if (!swapped)
                break;
        }
    }

    public static void printArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int[] arr = { 64, 25, 12, 22, 11 };
        selectionSort(arr);
        System.out.println("Sorted array: ");
        printArray(arr);
    }
}
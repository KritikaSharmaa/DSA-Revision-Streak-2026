package Arrays;


//Time: O(N) — each element is processed at most a constant number of times.
//Space: O(1) — only low, mid, high, and temp are used.
//Sorting: in-place.
public class Sort012 {
    public static void swapNos(int[] arr, int i , int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void sortO12(int[] arr){
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        
        while(mid <= high){
            if(arr[mid] == 0){
                swapNos(arr, low, mid);
                low++;
            }else if(arr[mid] == 1){
                mid++;
            }else if(arr[mid] == 2){
                swapNos(arr, mid, high);
                high--;
            }
        }
    }
    
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = {1,0,0,2,2,1,0,1,0,0,2,0,2};
		sortO12(arr);
		printArr(arr);
	}
}

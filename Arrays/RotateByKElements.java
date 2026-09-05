package Arrays;

public class RotateByKElements {
        public static void rotateByK(int[] arr, int k){
        
        reverseArr(arr, 0, arr.length - k - 1);
        reverseArr(arr, arr.length - k, arr.length - 1);
        reverseArr(arr, 0, arr.length - 1);
        
    }
    
    public static void reverseArr(int[] arr, int start, int end){
        while(start < end){
            int temp =  arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            
            start++;
            end--;
        }
    }
    
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr = {1,2,3,4,5,6,7};
		int k =3;
		
		rotateByK(arr, k);
		
		printArr(arr);
	}
}

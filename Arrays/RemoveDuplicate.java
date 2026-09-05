package Arrays;

public class RemoveDuplicate {
     public static void removeDuplicate(int[] arr){
        int p=0;
        for(int i=1; i<arr.length;i++){
            if(arr[i-1] != arr[i]){
                arr[++p] = arr[i];
            }
        }
        
        while(p<arr.length-1){
            arr[++p] = 0;
        }
    }
    
    public static void printArr(int[] arr){
        for(int i=0;i<arr.length;i++)
            System.out.print(arr[i]+" ");
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
        int[] arr={1,1,1,2,2,3,3,3,3,4,4};
        removeDuplicate(arr);
        System.out.println("removed duplicate");
        printArr(arr);
	}
}

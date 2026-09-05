package Arrays;

public class SecondLargest {

    public static int secondLargest(int[] arr){
        int max = arr[0];
        int smax = arr[0];
        
        for(int i=1;i<arr.length;i++){
            if(arr[i]< max && arr[i]>smax){
                smax=arr[i];
            }else if(arr[i]>max){
                smax = max;
                max = arr[i];
            }
        }
        
        return smax;
    }
    public static void main(String[] args) {
        int[] arr = {8, 1, 7, 14, 3, 99, 4, 12, 5};
        System.out.println(secondLargest(arr));
        
    }
}

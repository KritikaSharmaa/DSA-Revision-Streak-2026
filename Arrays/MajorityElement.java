package Arrays;

public class MajorityElement {
    public static int findMajority(int[] arr){
        
        int element = 0;
        int count = 0;

        for(int i = 0; i < arr.length; i++){
            if(count == 0){
                element = arr[i];
                count = 1;
            }else if(element == arr[i]){
                count++;
            }else{
                count--;
            }
        }
        
        int total_occurance = 0;
        
        for(int k = 0; k< arr.length; k++){
            if(arr[k] == element)
                total_occurance++;
        }
        
        if(total_occurance > arr.length / 2)
            return element;
        else return -1;
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		int[] arr= {7, 0, 0, 1, 7, 7, 2, 7, 7};
		int res = findMajority(arr);
		System.out.println(res);
	}
}

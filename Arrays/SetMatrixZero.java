package Arrays;

public class SetMatrixZero{

    //Overall Time Complexity: O(r*c)+ O(r*c) = O(r*c) where r = number of rows and c = number of columns
    //Space Complexity: O(1)
    public static void matrixZero_optimal(int[][] arr){
        int col0 = 1; //otherwise it make row 0 and column 0 to zero if only one of them has zero in it. So we need to keep track of column 0 separately.
        
        for(int i = 0; i<arr.length; i++){      //O(r*c)
           for(int j = 0; j< arr[0].length; j++){
               if(arr[i][j] == 0){
                   if(j == 0){
                        col0 = 0;
                   }else{
                        arr[0][j] = 0;
                        arr[i][0] = 0;
                   }
               }
           }
       }
        
        for(int i = arr.length-1; i>=0 ; i--){      //O(r*c)
            for(int j = arr[0].length -1; j>=1; j--){
                if(arr[0][j] == 0 || arr[i][0] == 0){
                    arr[i][j] = 0;
                }
            }
             
            if (col0 == 0) {
                arr[i][0] = 0;
            }
        }
        
    }

    //Overall Time Complexity: O(r*c)+ O(r*c) = O(r*c) where r = number of rows and c = number of columns
    //Space Complexity: O(r+c)
    public static void matrixZero(int[][] arr){
        int[] row = new int[arr.length];
        int[] col = new int[arr[0].length];
        
        for(int i = 0; i<arr.length;i++){   //O(n*m)
            for(int j=0; j<arr[0].length; j++){
                if(arr[i][j] == 0){
                    row[i] = -1;
                    col[j] = -1;
                }
            }
        }
        
        for(int i = 0; i<arr.length;i++){       //O(n*m)
            for(int j=0; j<arr[0].length; j++){
                if(row[i] == -1 || col[j] == -1){
                    arr[i][j] = 0;
                }
            }
        }
        
    }
    
    public static void printArr(int[][] arr){
        for(int i = 0; i<arr.length;i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
    
	public static void main (String[] args) throws java.lang.Exception
	{
		//int[][] mat = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        int[][] mat = {{1,1,1,1},{1,0,1,1},{1,1,0,1},{0,1,1,1}};
		//matrixZero(mat);
        matrixZero_optimal(mat);
		printArr(mat);
	}
}
import java.util.Arrays;

public class BinarySearch{
    //matrix is sorted in row wise and column wise
    public static void main(String[] args) {
        int [][] arr ={
            {1,2,3},
            {7,13,15},
            {20,25,29}
        };
        System.out.println(Arrays.toString(search(arr, 3)) );
    }
    public static int[] search(int [][] matrix, int target){
        int row = 0;
        int col =matrix.length -1 == 0 ? matrix.length : matrix.length-1;
       // System.out.println(col+"col is");
       if(matrix.length ==1 && matrix[0].length <= 1){
        //System.out.println(matrix[0].length+"matrix -0 length");
        if(matrix[0][0] == target){
            return new int[]{0,0};
        }else{
            return new int[]{0,0};
        }
       }else{

       
        while(row < matrix.length && col >= 0){
           // System.out.println(matrix[row][col]+"element is");
            if(matrix[row][col] == target){
                return new int[]{row,col};
            }
            if(matrix[row][col] < target){
                row++;
            }else {
                col--;
            }
        }
        return new int[]{-1,-1};}
    }
}
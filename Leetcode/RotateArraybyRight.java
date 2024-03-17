import java.util.Arrays;

public class RotateArraybyRight {
    public static void main(String[] args) {
        int[] arr ={1,2,3,4,5,6,7,8};
        RotateArray(arr, 3);
        //System.out.println(Arrays.toString(arr));
        for (int i : arr) {
            System.out.print(i+" ");
        }
    }
    public static void Reverse(int[] arr,int start, int end){
        int temp;
        while(start <= end){
            temp = arr[start];
            arr[start] =arr[end];
            arr[end] = temp;
            start ++;
            end--;
        }
    }
    public static void RotateArray(int[] arr, int k){
        int n = arr.length;
        k=k%n;
        Reverse(arr,0,(n-k-1));
        Reverse(arr, n-k, n-1);
        Reverse(arr, 0, n-1);
    }
}

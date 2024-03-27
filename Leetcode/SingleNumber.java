
import java.util.Arrays;

class SingleNumber{
    public static void main(String[] args) {
        int[] arr ={1};
        System.out.println(SingleNumberInAnArray(arr));
    }
    public static int SingleNumberInAnArray(int[] arr){
        Arrays.sort(arr);
        if(arr.length == 1){
            return arr[0];
        }
        for(int i=0;i<arr.length-2;i=i+2){
            if(arr[i]!=arr[i+1]){
                return arr[i];
            }
        }
        return arr[arr.length-1];
    }
}
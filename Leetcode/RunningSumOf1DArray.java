public class RunningSumOf1DArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
       // System.out.println(arr.length);
       System.out.println(Runningsum(arr));
    }   
    public static int[] Runningsum(int[] arr){
        int len = arr.length;
        int[] result = new int[len];
        result[0] = arr[0];   
        for(int i=1;i<len;i++){
            result[i] = result[i-1] + arr[i];  // inserting into result where adding the index in array and previous index in result.
        }
        return result;
    } 
}

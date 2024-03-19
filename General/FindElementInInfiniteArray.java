public class FindElementInInfiniteArray {
    public static void main(String[] args) {
        int[] arr= {2,4,8,9,10,15,17,19,20,28};
        int target = 10;
        System.out.println(FindIndex(arr, target));
    }
    public static int FindIndex(int[] arr,int target){
        int start = 0;
        int high = 1;
        while(arr[high] < target){
            start = high;
            high = 2*high;
        }
       return BinarySearchInfiniteArray(arr,start,high,target);
    }
    public static int BinarySearchInfiniteArray(int[] arr,int start,int end,int target){
        int mid;
        while(start <= end){
            mid = (start +end)/2;
            if(arr[mid]==target){
                return mid;
            }else if(arr[mid] > target){
                end = mid-1;
            }else{
                start = mid+1;
            }
        } 
        return -1;
    }
}

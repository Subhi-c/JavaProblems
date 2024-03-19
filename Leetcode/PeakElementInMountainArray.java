public class PeakElementInMountainArray {
    public static void main(String[] args) {
        int[] arr={0,1,2,4,10,8,4,3};
        System.out.println(PeakIndex(arr));
    }   
    public static int PeakIndex(int[] arr){
        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start < end){
            mid = (start + end) /2;
            if(arr[mid] > arr[mid+1]){
                end=mid;
            }else if(arr[mid] < arr[mid+1]){
                start = mid+1;
            }
        }
        return start;
    }  
}

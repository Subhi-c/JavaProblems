public class BinarSearchin1DArray {
    public static void main(String[] args) {
        int[] arr={1,2,6,7,12,17,89};
        if(Search(arr, 0)){
            System.out.println("Target Present");
        }else{
            System.out.println("Targe Not Found");
        }
    }
    public static boolean Search(int [] arr,int target){
        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start <= end){
            mid = start +(end-start) /2;
            if(arr[mid]==target){
                return true;
            } 
            if(arr[mid]> target){
                start = mid+1;
            }else{
                end =mid-1;
            }

        }
        return false;
    }
}

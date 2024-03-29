public class LongestSubstringWithoutRepeating {
    public static void main(String[] args) {
        int[] nums = {4,5,6,7,0,1,2};
        for(int i=0;i<nums.length;i++){
            if(SearchN(nums,2*nums[i])){
                System.out.println("Found");
            }
        }
        System.out.println("Not FOund");
    }
    public static boolean SearchN(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;
        int mid;
        while(start <= end){
            mid = start +(end -start) /2;
            if(arr[mid] == target){
                return true;
            } else if( arr[mid] > target){
                end = mid-1;
            } else if(arr[mid] < target){
                start = mid+1;
            }
        }
        return false;
    }
}

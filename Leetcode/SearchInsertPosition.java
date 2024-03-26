public class SearchInsertPosition {
    public static void main(String[] args) {
        int[] nums = {1,3};
        int target = 2;
        System.out.println(Search(nums, target));
    }
    public static int Search(int[]  nums,int target){
        int start = 0;
        int end = nums.length;
        int mid;
        if(target > nums[end-1]){
            return end;
        }
        while(start <= end){
            mid = start +(end-start) /2;
            if(nums[mid] == target){
                return mid;
            }else if( nums[mid] > target){
                end=mid-1;
            }else{
                start = mid+1;
            }
        }
        return start;
    }
}

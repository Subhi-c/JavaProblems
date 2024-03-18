import java.util.Arrays;

public class FirstandLastIndex {
  public static void main(String[] args) {
    int[] nums = {2,2,6,7,7,7,7,7,9,10};
    int ans[]={-1,-1};
    ans[0] = search(nums,7,true);
    ans[1] = search(nums, 7, false);
    System.out.println(Arrays.toString(ans));
  } 
  public static int search(int[] nums,int target,boolean isStart){
        int start =0;
        int end = nums.length-1;
        int mid;
        int ans =-1;
        while(start <= end){
            mid = start +(end-start)/2;
            if(nums[mid] > target){
                end = mid-1;
            }else if(nums[mid] < target){
                start = mid+1;
            } else if(nums[mid] == target){
                ans = mid;
                if(isStart){
                    end = mid-1;
                }else{
                    start = mid+1;
                }
            }
        }
        return ans;
  }  
}

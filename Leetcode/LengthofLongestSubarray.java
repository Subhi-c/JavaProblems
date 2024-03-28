import java.util.Arrays;
import java.util.HashMap;

public class LengthofLongestSubarray {
    public static void main(String[] args) {
        int[] nums={1,4,4,3};
        int k=1;
        System.out.println(LongestSubarray(nums, k));
    }
    public static int LongestSubarray(int[] nums, int k){
        int max = 0;
        HashMap<Integer,Integer> map = new HashMap<>();
       // for(int i=0;i<nums.length;i++){
        int start =0;
       // int end =0;
        for(int end = 0;end<nums.length;end++){
            map.put(nums[end], map.getOrDefault(nums[end], 0) + 1);
           // System.out.println(map);
            while(map.get(nums[end]) > k){

               // end =start;
               map.put(nums[start], map.get(nums[start]) - 1);
               start++;
              // count =0;
            }
           // count++;
             max=Math.max(max, end-start+1);
        }
        return max;
    }
}

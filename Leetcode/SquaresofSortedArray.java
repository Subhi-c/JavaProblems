import java.util.Arrays;

public class SquaresofSortedArray {

    public static void main(String[] args) {
        int[] nums = {10,0,3,6,2};
        Squares(nums);
        System.out.println(Arrays.toString(nums));
    }
    public static void Squares(int[] nums){
        for(int i=0;i<nums.length;i++){
            nums[i] = nums[i]*nums[i];
        }
        Arrays.sort(nums);
    }
}
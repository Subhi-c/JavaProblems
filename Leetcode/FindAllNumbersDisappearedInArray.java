import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllNumbersDisappearedInArray {
    public static void main(String[] args) {
        int[] nums={4,3,2,7,8,2,3,1};
        System.out.println(missingNum(nums));
    }
    public static List<Integer> missingNum(int[] nums){
    //     List<Integer> list = new ArrayList<>();
    //   //  Arrays.sort(nums);
    //     for(int i =1;i<=nums.length;i++){
    //         list.add(i);
    //     }
    //     for(int i=0;i<nums.length;i++){
    //         int index = list.indexOf(nums[i]);
    //         if(index != -1){
    //             list.remove(index);
    //         }
    //     }
    //     return list;
        List<Integer> result = new ArrayList<>();

        // Mark numbers as negative to indicate presence
        for (int i = 0; i < nums.length; i++) {
            int index = Math.abs(nums[i]) - 1;
            if (nums[index] > 0) {
                nums[index] = -1 * nums[index];
            }
        }
        //System.out.println(Arrays.toString(nums));
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] > 0) {
                result.add(i + 1);
            }
        }
        return result;
    }
}

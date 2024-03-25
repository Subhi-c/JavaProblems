import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindAllDuplicatesInArray {
    public static void main(String[] args) {
        int[] nums = {1,2,2};
       List <Integer> list = Duplicate(nums);
       // System.out.println(list);
    }
    public static List<Integer> Duplicate(int[] nums){
        List<Integer> list = new ArrayList<>();
       // Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            // if(nums[i] == nums[i+1]){
            //     list.add(nums[i]);
            // }
            if(nums[i] <0){
                list.add(nums[i]);
            }else{
                nums[nums[i]-1] = nums[i]*-1;
            }  
        }
        System.out.println(Arrays.toString(nums));
        System.out.println(list);
        return list;
    }
}

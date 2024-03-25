import java.util.Arrays;

public class ReplaceElementsInAnArray {

    public static void main(String[] args) {
        int[] nums={1,2};
        int[][] operations = { {1,3},
                               {2,1},
                               {3,2}
                            };
        System.out.println(Arrays.toString(Replace(nums, operations)));
    }
    public static int[] Replace(int[] nums ,int[][] operations){

        for(int i=0;i<operations.length;i++){
           // int index = operations[i][];
           int index = Contains(nums, operations[i][0]);
           int replace = operations[i][1];
           nums[index] = replace; 
        }

        return nums;
    }
    public static int Contains(int[] num,int target){
        for(int i=0;i<num.length;i++){
            if(num[i] == target){
                return i;
            }
        }
        return -1;
    }
}
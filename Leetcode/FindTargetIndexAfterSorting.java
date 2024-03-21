import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindTargetIndexAfterSorting {
    public static void main(String[] args) {
        int[] arr = {1,2,5,2,3};
        int target = 2;
        System.out.println(findTarget(arr, target));
    }
    public static List<Integer> findTarget(int[] arr,int target){
            Arrays.sort(arr);
            List<Integer> result = new ArrayList<Integer>();
            for(int i=0;i<arr.length;i++){
                if(arr[i] == target){
                    result.add(i);
                }
            }
        return result;
        
    }
}

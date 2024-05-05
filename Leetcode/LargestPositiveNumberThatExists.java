import java.util.*;

public class LargestPositiveNumberThatExists{
    public static void main(String[] args) {
        int[] nums ={-1,10,6,7,-7,1};
        System.out.println(FindExists(nums));
    }
    public static int FindExists(int[] arr){
        HashSet<Integer> set = new HashSet<Integer>();
        int result = -1;
        for(int i=0;i<arr.length;i++){
            if(set.contains(-1*arr[i])){
                result = Math.max(result , Math.abs(arr[i]));
            }
            set.add(arr[i]);
        }
        return result;
    }
}
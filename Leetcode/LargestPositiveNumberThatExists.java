import java.util.*;

public class LargestPositiveNumberThatExists{
    public static void main(String[] args) {
        int[] nums ={-1,10,6,7,-7,1};
        System.out.println(FindExists(nums));
    }
    public static int FindExists(int[] arr){
        HashSet<Integer> set = new HashSet<Integer>();
        for(int i=0;i<arr.length;i++){
            if(set.contains(-1*arr[i])){
                return arr[i];
            }
            set.add(arr[i]);
        }
        return 0;
    }
}
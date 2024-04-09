import java.util.HashMap;

public class ContainesDuplicateII {
    public static void main(String[] args) {
        int[] nums ={1,2,3,1,2,3};
        int k = 2;
        System.out.println(CheckForDuplicate(nums, k));
    }
    public static boolean CheckForDuplicate(int[] nums, int k){
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(nums[i])){
               if(Math.abs(map.get(nums[i]) - (i+1)) <= k ){
                return true;
               }
            }
            map.put(nums[i], i);
        }
        return false;
    }
}

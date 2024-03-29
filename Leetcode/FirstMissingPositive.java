public class FirstMissingPositive {
    public static void main(String[] args) {
        int[] nums = {1,2,0};
        System.out.println(MissingPositive(nums));
    }
    public static int MissingPositive(int[] nums){
        int result =0;
        int i=1;
        for(;i<=nums.length;i++){
            if(!Contains(nums, i)){
                result = i;
                return result;
            }
        }
      //  System.out.println(i);
        return i;        
    }
     public static boolean Contains(int[] num,int target){
        for(int i=0;i<num.length;i++){
            if(num[i] == target){
                return true;
            }
        }
        return false;
    }
}
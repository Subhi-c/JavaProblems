public class NumberofGoodPairs {
    public static void main(String[] args) {
        int[] nums={1,1,1,1};
        System.out.println(FindGoodPairs(nums));
    }
    public static int FindGoodPairs(int[] nums){
        int result = 0;
        for(int i=0;i<nums.length-1;i++){
            for(int j=i+1;j<nums.length;j++){
                if(nums[i] == nums[j]){
                    result++;
                }
            }
        }
        return result;
    }
}

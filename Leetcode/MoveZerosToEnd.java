public class MoveZerosToEnd{
    public static void main(String[] args) {
        int[] nums={1,2,3,0,9,5,0,2,0,0};
        MoveZeros(nums);
        for (int i : nums) {
            System.out.print(i+" ");
        }
    }
    public static void MoveZeros(int[] nums){
        int j=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                j=i;
                break;
            }
        }
        if(j>-1){
            for(int i=j+1;i<nums.length;i++){
                if(nums[i]!=0){
                    swap(nums,i,j);
                    j++;
                }
            }
        }
    }
    public static void swap(int[] nums,int start,int end){
        int temp = nums[start];
        nums[start] = nums[end];
        nums[end] = temp;
    }
}
package Leetcode;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        int[] arr={1,1,1,1,1,1};
        System.out.println("The maximun count is: "+CountOnes(arr));
    }
    public static int CountOnes(int[] arr){
        int count =0;
        int max=0;
        for (int i : arr) {
            if(i == 1){
                count++;
            }else{
                count =0;
            }
            if(count > max){
                max = count;
            }
        }
        return max;
    }
}

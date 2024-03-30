public class DigitsumandElmentsum{
    public int differenceOfSum(int[] nums) {
        int digitsum =0;
        int elementsum = 0;
        for(int i=0;i<nums.length;i++){
            elementsum+= nums[i];
            digitsum+= SumofDigit(nums[i]); 
        }
        System.out.println(elementsum);
        System.out.println(digitsum);
        return elementsum - digitsum;
    }
    public static int SumofDigit(int n){
        if ( n < 9) {
            return n;
        }
        int result = 0;
        while(n > 0){
            result= result+ (n%10);
            n=n/10;
        }
       // System.out.println(result);
        return result;
    }
}
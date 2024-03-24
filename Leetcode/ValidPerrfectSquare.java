public class ValidPerrfectSquare {
    public static void main(String[] args) {
        System.out.println(Find(2147483647));
    }
    public static boolean Find(int num){
       if(num == 1) return true;
          long start = 1;
        long end = num;
        long mid;
        while(start <= end){
            mid = start + (end - start ) /2;
            if(mid*mid == num){
                return true;
            }
            else if( mid*mid > num){
                end = mid-1;
            }else{
                start = mid+1;
            }
        }
        return false;
    }
}

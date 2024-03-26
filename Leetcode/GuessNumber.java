public class GuessNumber {
    public static void main(String[] args) {
        int n =10;
        System.out.println(Guess(n));
    }
    public static int Guess(int n){
         int start =0;
        int end = n;
        int mid;
        while(start <= end){
            mid = start +(end-start) /2;
            if(guess(mid) == 0){
                return mid;
            }else if( guess(mid) == -1){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return start;
    }
}

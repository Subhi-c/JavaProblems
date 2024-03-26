public class FirstBadVersion {
    public static void main(String[] args) {
        int n = 5;
        System.out.println(Find(n));
    }   
    public static int Find(int n){
         int start =0;
        int end = n;
        int mid;
        while(start <= end){
            mid = start +(end-start) /2;
            if(isBadVersion(mid) == 0){
                return mid;
            }else if( isBadVersion(mid) == -1){
                end = mid-1;
            } else{
                start = mid+1;
            }
        }
        return start;
    }
}

public class KokoEatingbananas{
    public static void main(String[] args) {
        int[] nums ={3,6,7,11};
        int k = 8;
        System.out.println(Find(nums,k));
    }
    public static int Find(int[]nums,int k){
        int left = 1;
     int right = 1;
     int mid;
     for(int pile: nums){
        right = Math.max(right,pile);
     }   
     while(left < right){
        mid = (left+right) /2;
        int res =0;
        for(int pile: nums){
            res += Math.ceil((double) pile / mid);
        }
        if(res <= k){
            right = mid;
        }
        else{
            left = mid+1;
        }
     }
     return right;
    }
}
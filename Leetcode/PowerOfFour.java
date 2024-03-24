public class PowerOfFour {
      public static void main(String[] args) {
        int n = 45;
        System.out.println(Duplicate(n));
    }
    public static boolean Duplicate(int n){
       if(n <=0){
        return false;
       }
       if(n == 1){
        return true;
       }
       if(n%4 !=0){
        return false;
       }
       return Duplicate(n/4);
    }
}

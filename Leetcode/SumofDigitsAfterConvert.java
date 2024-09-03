public class SumofDigitsAfterConvert {
    public static void main(String[] args){
        int sum =0;
        String s = "zbac";
        int k=2;
        String sb = "";
        for(int i=0;i<s.length()-1;i++){
            sb+= s.charAt(i)-96;
        }
        while( k>0){
            sum =0;
            for(int i=0;i<sb.length()-1;i++){
                sum += sb.charAt(i) -'0';
            }
            sb= String.valueOf(sum);
            k--;
        }
        System.out.println(sum);
    }
}

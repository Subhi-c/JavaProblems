package Strings;

public class ReverseWords {
    public static void main(String[] args) {
        String str = "a good   example";
        Reverse(str);
    }
    public static void Reverse(String s){
        String[] result;
        String resultString="";
        result =s.trim().split("\\s+"); //splits extra white space from the string
        int i = result.length-1;
        for(;i>=0;i--){
            resultString += result[i];
            if(i!=0){
                resultString += " ";
            }
        }
        System.out.println(resultString);
    }
}



public class ReverseWordsinString{
    public static void main(String[] args) {
     //  System.out.println(ValidParenthesis("(((((*)))**"));
     String result = Reverse("Let's take LeetCode contest", 0, 0);
    System.out.println(result);
    }
    public static String Reverse(String s,int start,int end){
        String result = "";
        while(end < s.length()){
            if(s.charAt(end) == ' '){
               result = result+ Swap(s, start, end-1)+" ";
                start = end+1;
               // end++;
            }
            end++;
        }
        
        result = result + (Swap(s, start, end - 1));
        return result;
    }
    public static String Swap(String s,int start,int end){
        char[] chars = s.substring(start, end+1).toCharArray();
        // String res = "";
        char temp ;
        int left = 0;
        int right = chars.length -1 ;
        while(left < right){
            temp = chars[left];
            chars[left] = chars[right];
            chars[right] = temp;
            left++;
            right--;
        }
        return new String(chars);
    }
}
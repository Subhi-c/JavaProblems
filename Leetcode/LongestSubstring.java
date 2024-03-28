import java.util.ArrayList;
import java.util.HashMap;

public class LongestSubstring {

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(Longestsubstring(s));
    }
    public static int Longestsubstring(String s){
         int count =0;
        int max = 0;
        int start= 0;
        int end = 0;
       // ArrayList<Character> list = new ArrayList<>();
        char ch ;
        if(s.length() == 1) return 1;
        HashMap<Character,Integer> map = new HashMap<>();
        while(end < s.length()){
            ch = s.charAt(end);
          //  int index = list.indexOf(ch);
            while( map.get(ch) != null){
                map.remove(s.charAt(start));
              //  System.out.println(list+"Removed string");
                start++;
               // count=0;
                //end = start;
            }
          //  count++;
            map.put(ch,end);
            max = Math.max(max, end-start+1);
           // System.out.println("Added list"+list);
            end++;
        }
        return max;
    }
}
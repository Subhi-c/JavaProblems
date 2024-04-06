public class MaketheStringGreat{
    public static void main(String[] args) {
        String s = "abBAcC";
        int index = 0;
        System.out.println(MakeitGreat(s, index));
    }
    public static String removeCharacters(String s, int startIndex) {
        return s.substring(0, startIndex) + s.substring(startIndex+2);
    }
    public static String MakeitGreat(String s,int index){
        if(s.isEmpty() || index==s.length()-1){
            return s;
        }
      //  while(index != s.length()){
            if(Math.abs(s.charAt(index) - s.charAt(index+1)) == 32){
               // s = s.substring(0,index) + s.substring(index+2);
                s = removeCharacters(s, index);
               // System.out.println(s);
            //    if (index > 0) {
            //     return MakeitGreat(s, index - 1); // Adjust index if removing characters
            // } else {
                return MakeitGreat(s, index); // Keep the index same if it's already at the start
          //  }
              // return MakeitGreat(s,index);
            }
           return MakeitGreat(s, index+1);
    //    }
       // return s;
    }
}
import java.util.ArrayList;
import java.util.List;

public class FindWordsContainingCharacter {
    public static void main(String[] args) {
        String[] str = {};
        System.out.println(Find(str, 'w'));
      //  Find(str,'e');
    }
    public static List<Integer> Find(String[] words,char x){
        List<Integer> result = new ArrayList<Integer>();
        for(int i=0;i<words.length;i++){
             if(words[i].indexOf(x) != -1){  //is index found in the array then add index to the List.
                result.add(i);
            }
        }
        return result;
    }
}

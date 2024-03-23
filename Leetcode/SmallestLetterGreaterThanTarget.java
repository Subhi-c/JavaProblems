
public class SmallestLetterGreaterThanTarget {
 public static void main(String[] args) {
    char[] letters={'a','b','d'};
    char target = 'c';
    System.out.println("The Letter Greater than target is: "+FindLetter(letters, target));
 }  
 public static char FindLetter(char[] letters, char target){
        int start =0;
        int end= letters.length -1;
        int mid;
        while(start <= end){
            mid =(start +end)/2;
            if(letters[mid] > target){
                end = mid-1;
            }else {
                start = mid+1;
            }
        }
        return letters[start % letters.length]; 
 } 
}

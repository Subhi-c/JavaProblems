package Strings;

public class ScoreofString{
    public static void main(String[] args) {
        String s = "hello";
        System.out.println(Score(s));
    }
    public static int Score(String s){
        int score = 0;
        for(int i=0;i<s.length()-1;i++){
            score = score + Math.abs((int)s.charAt(i) - (int)s.charAt(i+1));
        }
        return score;
    }
}
public class FinalValueofVariableAfterOperation{
    public static void main(String[] args) {
        String[] operation = {"X++","++X","--X","X--"};
        System.out.println(FindValue(operation));
    }
    public static int FindValue(String[] Operation){
        int result=0;
        for (String string : Operation) {
            if(string.contains("-")){
                result-=1;
            }else if(string.contains("+")){
                result+=1;
            }
        }
        return result;
    }
}
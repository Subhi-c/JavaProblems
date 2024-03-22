public class JewelsAndStones{
    public static void main(String[] args) {
        String jewels = "z";
        String stones ="ZZZ";
        System.out.println(FindStones(jewels, stones));
    }
    public static int FindStones(String jewels,String stones){
        int result = 0;
        int n = jewels.length();
        char ch;
        for(int i=0;i<n;i++){
            ch = jewels.charAt(i);
            result = result + count(stones, ch);
        }
        return result;
    }

    public static int count(String stones,char ch){
        int count=0;
        for(int i=0;i<stones.length();i++){
            if(stones.charAt(i) == ch){
                count++;
            }
        }
        return count;
    }
}
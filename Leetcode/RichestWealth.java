public class RichestWealth{
    public static void main(String[] args) {
        int[][] accounts = {{1,2,3},{3,2,1}};
        System.out.println(maximumWealth(accounts));
    }
     public static int maximumWealth(int[][] accounts) {
        int count  = 0 ;
        int max = 0;
        for(int i=0;i<accounts.length;i++){
            for(int j=0;j<accounts[i].length;j++){
                count += accounts[i][j];
            }
            max = Math.max(max,count);
            count =  0;
        }
        return max;
    }
}
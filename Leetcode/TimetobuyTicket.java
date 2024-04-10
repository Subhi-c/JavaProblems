public class TimetobuyTicket{
    public static void main(String[] args) {
        int[] nums = {2,3,2};
        int k = 2;
        System.out.println(timeCalculation(nums, k));
    }
     public static int timeCalculation(int[] tickets, int k) {
        int n = tickets.length;
        int time = 0;
        int i = 0;
        while (true) {
            if (tickets[i] > 0) {
                tickets[i]--;
                time++;
                if ((i) == k && tickets[i] == 0) {
                    return Math.abs(time);
                }
            }
            i = (i + 1) % n; 
    }
}
}
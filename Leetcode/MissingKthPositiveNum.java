
public class MissingKthPositiveNum {
    public static void main(String[] args) {
        int[] array ={1,2,3,4};
        System.out.print("THe missing num is:"+Missingnumber(array, 2));
    }
    public static int Missingnumber(int[] arr,int k){
        int count=0;
        int missing_num_count =0;
        int i=0;
        boolean found = false;
        while(i<arr.length){
            count++;
            if(count != arr[i]){
                missing_num_count++;
                if(missing_num_count == k){
                    found = true;
                    return count;
                }
            }else{
                i++;
            }
        }
        if(!found){
            return count+(k-missing_num_count);
        }
        return 0;
    }
}

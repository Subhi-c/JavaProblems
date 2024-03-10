public class Findmissingnumber {

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int n =6;
       int result =  MissingNum(arr,n);  // passing arguments and store it in result
       System.out.println("Missing Number is : "+ result);
    }

    public static int MissingNum(int arr[],int n){
        int totalSum = (n*(n+1)/2); //Formula to get sum of all numbers from 1 to n
        int overallSum =0; // initializing our overall sum to zero
        for(int i=0;i<n-1;i++){
            overallSum+=arr[i]; // adding array values to overall sum
        }
        return (totalSum-overallSum); // subtracting overall sum from total sum to get missing number.
    }
}
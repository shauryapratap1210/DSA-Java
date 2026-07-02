public class AvgofArray {
    public static void Avg(int arr[]){
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];

        }
        int  avg=sum/arr.length;
        System.out.println("Average of elements of array is : "+avg);

        //Time Complexity:O(n)
        //Space Complexity:O(1)
    }

    public static void main(String args[]){
        int arr[]={1,2,3,4,5,6};
        Avg(arr);
    }
}

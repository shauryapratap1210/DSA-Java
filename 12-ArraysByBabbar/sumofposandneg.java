public class sumofposandneg {
    public static void sum_of_both(int arr[]){
        int posSum=0, negSum=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>0){
                posSum+=arr[i];
            }
            else{
                negSum+=arr[i];
            }
        }

        System.out.println("Sum of psoitive number in array is : "+posSum);
        System.out.println("Sum of negative number in array is :"+negSum);

    }

    public static void main(String[] args) {
        int arr[]={1,-1,2,-2,3,-3};
        sum_of_both(arr);
    }
}

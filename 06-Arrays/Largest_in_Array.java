public class Largest_in_Array {
    public static int largest(int arr[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]>largest){
                largest=arr[i];
            }

        }
        return largest;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int large=largest(arr);
        System.out.println("Largest Element is : "+ large);
    }
}

//Time complexity is O(n)

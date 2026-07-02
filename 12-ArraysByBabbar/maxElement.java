public class maxElement {
    public static void maxElement(int arr[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                max=arr[i];
            }
        }
        System.out.println("Max element of array is : "+max);
    }

    public static void minElement(int arr[]){
        int min=Integer.MAX_VALUE;
        for(int i=0;i<arr.length;i++){
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("Min element of array is : "+min);
    }



    public static void main(String[] args) {
        int arr[]={-1,-2,-32,-345,-5,-6};
        maxElement(arr);
        minElement(arr);
    }
}

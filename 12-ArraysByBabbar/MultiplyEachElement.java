public class MultiplyEachElement {
    public static int[] Multiply(int arr[]){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]*10;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        int arr2[]=Multiply(arr);

        //Printing elements of array
        for(int i:arr2){
            System.out.println(i);

        }
    }
}

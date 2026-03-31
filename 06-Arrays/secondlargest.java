public class secondlargest {
    public static int secondlargest(int arr[]){
        int largest=arr[0];
        int slargest=-1;
        for(int i=1;i<arr.length;i++){
            if(arr[i]>largest){
                slargest=largest;
                largest=arr[i];
            }
            else if(arr[i]>slargest && arr[i]<largest){
                slargest=arr[i];
            }
        }
        return slargest;
    }

    public static void main(String[] args) {
        int arr[]={2,-1,4,5,6,7};
        int smallest=secondlargest(arr);
        System.out.println(smallest);
    }
}

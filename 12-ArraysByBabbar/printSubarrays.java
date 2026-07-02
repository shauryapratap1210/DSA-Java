public class printSubarrays {
    public static void printsub(int arr[]){
        int n=arr.length;
        int total=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                for(int k=i;k<=j;k++){
                    System.out.print(arr[k]+" ");

                }
                total++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("Total SubARRAYS are: "+total);
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4};
        printsub(arr);
    }
}

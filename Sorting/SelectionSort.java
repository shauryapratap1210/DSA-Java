public class SelectionSort {
    public static void selection_sort(int arr[]){
        int n= arr.length;
        for(int i=0;i<n;i++){
            int min=i;
            for(int j=i+1;j<n;j++){
                if(arr[j]<arr[min]){
                    min=j;
                }
            }
            //Swap
            int temp=arr[min];
            arr[min]=arr[i];
            arr[i]=temp;
        }


    }

    public static void main(String[] args) {
        int arr[]={1,2,6,4,5,8,9};
        selection_sort(arr);
        for(int val:arr){
            System.out.print(val+" ");
        }
    }
}

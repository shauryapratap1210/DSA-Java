public class unsortedelement {
    public static int unsortedelement(int arr[]){
        for(int i=1;i<arr.length;i++){
            if(arr[i]<arr[i-1]){
                return arr[i];
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,6,3};
        int ans=unsortedelement(arr);
        System.out.println("Unsorted element is :"+ans);
    }
}

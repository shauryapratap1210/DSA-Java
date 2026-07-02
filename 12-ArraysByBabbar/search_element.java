public class search_element {
    public static boolean search(int arr[],int target){
        for(int i=0;i<arr.length;i++){
            if(arr[i]==target){
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5};
        int t=6;
        boolean check=search(arr,t);
        System.out.println("Element found:"+check);
    }

}

public class pairs_of_array {
    public static void pairs(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<=n-1;j++){
                System.out.println("Pairs are : "+"("+arr[i]+","+arr[j]+")");
            }
        }
    }

    public static int[] twoSum(int arr[],int target){
        int n=arr.length;
        for(int i=0;i<n-1;i++){
            for(int j=i+1;j<=n-1;j++){
                if((arr[i]+arr[j])==target){
                    return new int[]{i,j};
                }
            }
        }
        return new int[]{-1,-1};
    }

    public static void main(String[] args) {
        int arr[]={2,1,3,5,4,6};
        pairs(arr);

        int ans[]=twoSum(arr,10);
        for(int i:ans){
            System.out.println(i);
        }

    }
}

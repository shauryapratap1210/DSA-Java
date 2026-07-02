public class triplets {
    public static void triplets(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=i+2;k<n;k++){
                    System.out.println("{"+arr[i]+","+arr[j]+","+arr[k]+"}");
                }
            }
        }
    }

    public static int[] Threesum(int arr[]){
        int n=arr.length;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=i+2;k<n;k++){
                    if((arr[i]+arr[j]+arr[k])==0){
                        return new int[]{arr[i],arr[j],arr[k]};
                    }
                }
            }
        }

        return new int[]{-1,-1,-1};

    }

    public static void main(String[] args) {
        int arr[]={-1,0,1,2,-1,-4};
        triplets(arr);
        int ans[]=Threesum(arr);
        for(int n:ans){
            System.out.println(n);
        }
    }
}

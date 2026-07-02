
public class countzerosandone {
    public static int[] countzeroandone(int[] arr){
        int onecount=0,zerocount=0;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==0){
                zerocount++;
            }
            else{
                onecount++;
            }

        }
        int ans[]={zerocount,onecount};
        return  ans;
    }


    public static void main(String[] args) {
        int arr[]={1,0,0,1,1};
        int ans[]=countzeroandone(arr);
        System.out.println("Number of zeros in array is :"+ans[0]);
        System.out.println("Number of ones in array is :"+ans[1]);
    }

}

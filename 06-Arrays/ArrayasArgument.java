public class ArrayasArgument {
    public static void update(int arr[], int n){
        for(int i=0;i<arr.length;i++){
            arr[i]=arr[i]+1;
            n=n+1;
        }
    }

    public static void main(String[] args) {
        int nums[]={1,2,3};
        int num=3;
        update(nums,num);//Here Changes are made in array
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]+" ");
        }
        System.out.println(num);//Here int data doesnt changed

    }
}

public class Subarrays {
    public static void print_subarrays(int nums[]){
        int ts=0;
        for(int i=0;i< nums.length;i++){
            
            for(int j=i;j< nums.length;j++){

                for(int k=i;k<=j;k++){
                    System.out.print(nums[k]+" ");
                }
                ts++;
                System.out.println();
            }
            System.out.println();

        }
        System.out.println("Total subarrays are : "+ ts);
    }

    public static void main(String[] args) {
        int nums[]={1,2,3,4};
        print_subarrays(nums);
    }
}

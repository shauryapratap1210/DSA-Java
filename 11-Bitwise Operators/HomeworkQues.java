public class HomeworkQues {
    public static void countsetbit(int n){
        int count=0;
        while(n!=0){
            if((n&1)==1){
                count++;
            }
            n>>=1;

        }

        System.out.println("Total set bits are "+count);
    }

    public static void missing(int arr[],int num){
        int xor1=0;
        int xor2=0;
        for(int i=0;i<=num;i++){
            xor1^=i;
        }

        for(int i = 0; i<arr.length; i++){
            xor2^=arr[i];
        }

        System.out.println("Missing number is : "+(xor1^xor2));
    }

    public static void unique(int arr[]){
        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];
        }
        System.out.println("Unique elements are "+xor);
    }

    public static void main(String[] args) {
        countsetbit(7);
        int arr[]={0,1,2,3,5,6};
        missing(arr,6);
        int arr2[]={1,1,2,2,3,3,4,5};
        unique(arr2);
    }
}

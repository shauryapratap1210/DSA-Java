public class shiftByOne {
    public static void shiftone(int arr[]){
        //Store last element
        int temp=arr[arr.length-1];     //O(1)

        //Move elements
        for(int i=arr.length-1;i>0;i--){    //O(n)
            arr[i]=arr[i-1];
        }

        //Put element back      //O(1)
        arr[0]=temp;
    }

    public static void shiftbyK(int arr[],int k){
        int n=arr.length;

        k=k%n;  //In order to calculate rotations

        //Storing temp eleemnts to rotate
        int temp[]=new int[k];
        for(int i=0;i< temp.length;i++){     //O(k)
            temp[i]=arr[(n-k)+i];
        }

        //Move elements
        for(int i=n-k-1;i>=0;i--){     //O(n-k)
            arr[i+k]=arr[i];
        }

        //Putting elements back    //O(k)
        for(int i=0;i<temp.length;i++){
            arr[i]=temp[i];
        }
    }

    public static void main(String[] args) {
        int arr[]={1,2,3,4,5,6};
        shiftbyK(arr,2);

        for(int i:arr){
            System.out.print(i+" ");
        }
    }
}

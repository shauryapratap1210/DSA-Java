public class MergeSortedarray {
    public static int[] mergearray(int arr1[],int arr2[]){
        int m=arr1.length;
        int n=arr2.length;
        int i=0;
        int j=0;
        int res[]=new int[m+n];
        int id=0;
        while(i<m && j<n){
            if(arr1[i]<=arr2[j]){
                res[id++]=arr1[i++];
            }
            else{
                res[id++]=arr2[j++];
            }
        }
        while(i<m){
            res[id++]=arr1[i++];
        }
        while(j<n){
            res[id++]=arr2[j++];
        }
        return res;
    }

    public static void main(String[] args) {
        int arr[]={2,4,6};
        int arr2[]={1,3,5};
        int n[]=mergearray(arr,arr2);
        for(int i=0;i<n.length;i++){
            System.out.print(n[i]+" ");
        }
    }
}

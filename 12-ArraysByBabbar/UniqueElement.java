import java.util.HashMap;

public class UniqueElement {
    public static int unique(int arr[]){
        /* O(n^2)
        int n=arr.length;

        for(int i=0;i<n;i++){
            int count=0;
            int num=arr[i];
            for(int j=0;j<n;j++){
                if(num==arr[j]){
                    count++;

                }
            }
            if(count==1){
                return num;
            }
        }
        return -1;

         */

        HashMap<Integer,Integer>map=new HashMap<>();
        //Putting in hashmap

        /*Hash Map:O(n)
        for(int i=0;i<arr.length;i++){

            map.put(arr[i],map.getOrDefault(arr[i],0)+1);
        }

        //Fetch
        for(int i=0;i<arr.length;i++){
            if(map.get(arr[i])==1){
                return arr[i];
            }

        }
        return -1;*/

        int xor=0;
        for(int i=0;i<arr.length;i++){
            xor^=arr[i];

        }
        return xor;
    }

    public static void main(String[] args) {
        int arr[]={1,2,2,3,1};
        int uni=unique(arr);
        System.out.println(uni);
    }
}

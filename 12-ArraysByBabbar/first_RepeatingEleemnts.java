import java.util.HashMap;

public class first_RepeatingEleemnts {
    public static  int Repeating(int arr[]){
        /*for(int i=0;i<arr.length;i++){
            int num=arr[i];
            int count=0;

            for(int j=0;j<arr.length;j++){
                if(arr[j]==num){
                    count++;
                }
            }

            if(count>1){
                return num;
            }

        }

        return -1;

    }

    public static void main(String[] args) {
        int arr[]={1,2,3,3,4,5,55,5,5};
        int ans=Repeating(arr);
        System.out.println(ans);
         O(n^2)
         */

        //Using Map
        HashMap<Integer,Integer>freq=new HashMap<>();
        for(int i=0;i<arr.length;i++){
            freq.put(arr[i],freq.getOrDefault(arr[i],0)+1);
        }


        for(int i:freq.keySet()){
            if(freq.get(i)>1){
                return i;
            }
        }

        return -1;



    }
    public static void main(String[] args) {
        int arr[] = {1, 2, 2, 3, 4, 5, 55, 5, 5};
        int ans = Repeating(arr);
        System.out.println(ans);
    }
}

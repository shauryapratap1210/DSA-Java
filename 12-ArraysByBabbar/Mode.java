import java.util.*;

public class Mode {
    

       public static void getMode(int[] arr){
           /*

        HashMap<Integer,Integer>freq=new HashMap<>();

        for(int num:arr){
            freq.put(num, freq.getOrDefault(num,0)+1);
        }

        for(int i:freq.keySet()){
            System.out.println(i+"  -->"+ freq.get(i));

        }

            int maxFreq=-1;
            int maxKey=-1;

            for(int key:freq.keySet()){
                int currkey=key;
                int currkeyfreq=freq.get(key);

                if(maxFreq<currkeyfreq){
                    maxKey=currkey;
                    maxFreq=currkeyfreq;
                }
            }


            return maxKey ;

        */

           HashMap<Integer,Integer>freq=new HashMap<>();

           for(int num:arr){
               freq.put(num,freq.getOrDefault(num,0)+1);
           }

           for(int i:freq.keySet()){
               System.out.println(i+"--->"+freq.get(i));
           }


           int maxFreq=-1;
           int maxKey=-1;

           for(int i:freq.keySet()){
               int currkey=i;
               int currFreq=freq.get(i);
               if(currFreq>maxFreq){
                   maxFreq=currFreq;
                   maxKey=currkey;
               }
           }


           System.out.println("Mode of array is : "+maxKey);









    }


    public static void main(String[] args) {
        int arr[]={1,1,1,1,2,2,2,2,2,4,4,4};
        getMode(arr);
//        System.out.println("Mode of array is :"+mode);
    }
}

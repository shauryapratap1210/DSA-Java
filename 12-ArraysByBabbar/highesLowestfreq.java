import java.util.*;

public class highesLowestfreq {
    public static int[] getHigh_LowFreq(int arr[]){
        HashMap<Integer,Integer> freq=new HashMap<>();

        for(int num:arr){
            freq.put(num,freq.getOrDefault(num,0)+1);
        }

        for(int key:freq.keySet()){
            System.out.println(key+" -->"+ freq.get(key));
        }
        int maxkey=-1;
        int maxFreq=-1;
        int minFreq=Integer.MAX_VALUE;
        int minkey=-1;

        for(int i: freq.keySet()){
            int currfreq=freq.get(i);
            int currkey=i;
            if(currfreq<minFreq){
                minFreq=currfreq;
                minkey=currkey;
            }
            else if(currfreq>maxFreq){
                maxFreq=currfreq;
                maxkey=currkey;
            }
        }

        return new int[] {minkey,maxkey};

    }

    public static void main(String[] args) {
        int arr[]={1,1,1,2,2,2,2,2,2,4,4,4,4,4};
        int ans[]=getHigh_LowFreq(arr);
        System.out.println("Max Key is : "+ans[1]);
        System.out.println("Min Key is : "+ans[0]);

    }
}

import java.util.ArrayList;
import java.util.List;

public class waveprint {
    public static List<Integer> wave(int arr[][], int m,int n){
        List<Integer>ans=new ArrayList<>();
        for(int  col=0;col<m;col++){
            if(col%2==0){
                for(int row=m-1;row>=0;row--){
                    ans.add(arr[row][col]);
                }
            }
            else{
                for(int row=0;row<m;row++){
                    ans.add(arr[row][col]);
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        List<Integer>ans=new ArrayList<>();
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        ans=wave(arr,3,3);
        System.out.println(ans);
    }
}

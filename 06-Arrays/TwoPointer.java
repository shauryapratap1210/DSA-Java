import java.sql.SQLOutput;
import java.util.Arrays;
public class TwoPointer {
    public static int[] TwoPointer(int[] arr, int target){
        Arrays.sort(arr);
        int i=0;
        int j=(arr.length)-1;
        while(i<j){
            int sum=arr[i]+arr[j];
            if(sum==target){
                return new int[]{i, j};
            }
            else if(sum>target){
                j--;
            }
            else{
                i++;
            }


        }
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int nums[]={1,3,4,5};
        int ans[]=TwoPointer(nums,6);
        for(int i=0;i< ans.length;i++){
            System.out.print(ans[i]+" ");
        }
    }
}

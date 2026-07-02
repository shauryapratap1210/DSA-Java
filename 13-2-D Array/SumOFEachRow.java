import java.util.*;
public class SumOFEachRow {
    public static List<Integer> rowsum(int arr[][]){
        List<Integer>ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            int sum=0;
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];





            }
            ans.add(sum);
        }

        return ans;

    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{2,3,4},{4,5,6}};
        List<Integer>ans=new ArrayList<>();
        ans=rowsum(arr);
        System.out.println(ans);
    }
}


//Time Complexity:O(n^2)

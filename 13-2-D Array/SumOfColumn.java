import java.util.*;

public class SumOfColumn {
    public static List<Integer> columnsum(int arr[][]){
        List<Integer>ans=new ArrayList<>();
        int m=arr.length;
        int n=arr[0].length;
        for(int col=0;col<n;col++){
            int sum=0;
            for(int row=0;row<m;row++){
                sum+=arr[row][col];


            }
            ans.add(sum);

        }
        return ans;
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{3,4,5},{6,6,7}};
        List<Integer>list=new ArrayList<>();
        list=columnsum(arr);
        System.out.println(list);
    }
}

public class TransposeMatrix {
    public static int[][] transpose(int arr[][]){
        if(arr.length==0){
            return new int[0][0];
        }

        //for original array
        int totrow=arr.length;
        int totcol=arr[0].length;
        //New Array
        int newrow=totrow;
        int newcol=totcol;
        int ans[][]=new int[newrow][newcol];
        for(int i=0;i<newrow;i++){
            for(int j=0;j<newcol;j++){
                ans[i][j]=arr[j][i];
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        int arr[][]={{1,2,3},{4,5,6},{7,8,9}};
        int ans[][]=transpose(arr);
        for(int i=0;i<ans.length;i++){
            for(int j=0;j<ans[i].length;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }
}

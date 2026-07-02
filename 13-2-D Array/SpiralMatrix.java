import java.util.*;

public class SpiralMatrix {
    public static List<Integer> checkspiralMatrix(int arr[][]){
        int m= arr.length;
        int n=arr[0].length;
        List<Integer>list=new ArrayList<>();

        int startrow=0;
        int endCol=n-1;
        int endrow=m-1;
        int startCol=0;


        while(startrow<=endrow && startCol<=endCol){
            //left to right
            for(int i=startrow;i<=endrow;i++){
                list.add(arr[startrow][i]);

            }
            startrow++;
            //top to bottom

            for(int i=startrow;i<=endrow;i++){
                list.add(arr[i][endCol]);
            }
            endCol--;
            //right to left
            if(startrow <= endrow){

                for(int i=endCol;i>=startCol;i--){
                    list.add(arr[endrow][i]);
                }

                endrow--;
            }

            //bottom to top
            if(startCol<=endCol){
                for(int i=endrow;i>=startrow;i--){
                    list.add(arr[i][startCol]);
                }
                startCol++;
            }


            }

        return list;
    }

    public static void main(String[] args) {
        int mat[][]= {
                {1,2,3,4},
                {5,6,7,8},
                {9,10,11,12},
                {13,14,15,16}
        };

        List<Integer>ans=new ArrayList<>();
        ans=checkspiralMatrix(mat);
        System.out.println(ans);

        }
}

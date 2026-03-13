import java.sql.SQLOutput;

public class floyd_triangle {
    public static void floyd_triangle(int TotLines){
        int counter=1;
        for(int i=1;i<=TotLines;i++){
            for(int j=1;j<=i;j++){
                System.out.print(counter+" ");
                counter++;
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        floyd_triangle(5);
    }
}

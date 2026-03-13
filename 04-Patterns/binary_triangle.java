public class binary_triangle {
    public static void binary_triangle(int TotLines){
        for(int i =1;i<=TotLines;i++){
            for(int j=1;j<=i;j++){
                if((i+j)%2==0){
                    System.out.print("1"+" ");
                }
                else{
                    System.out.print("0"+" ");
                }
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        binary_triangle(5);
    }
}

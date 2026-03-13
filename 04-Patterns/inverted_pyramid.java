public class inverted_pyramid {
    public static void inverted_pyramid(int TotRows,int TotCols){
        for(int i=1;i<=TotRows;i++){
            for(int spaces=1;spaces<=TotRows-i;spaces++){
                System.out.print(" ");
            }
            for(int stars=1;stars<=i;stars++){
                System.out.print("*");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        inverted_pyramid(4 ,5);
    }

}

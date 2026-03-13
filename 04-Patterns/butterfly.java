public class butterfly {
    public static void butterfly(int TotLines){
        //1st Half
        for(int i=1;i<=TotLines;i++){
            for(int stars=1;stars<=i;stars++){
                System.out.print("*");
            }
            for(int spaces=1;spaces<=2*(TotLines-i);spaces++){
                System.out.print(" ");
            }
            for(int stars=1;stars<=i;stars++){
                System.out.print("*");
            }
            System.out.println();

        }
        //2nd Half
        for(int i=TotLines;i>=1;i--){
            for(int stars=1;stars<=i;stars++){
                System.out.print("*");
            }
            for(int spaces=1;spaces<=2*(TotLines-i);spaces++){
                System.out.print(" ");
            }
            for(int stars=1;stars<=i;stars++){
                System.out.print("*");
            }
            System.out.println();



        }

    }

    public static void main(String[] args) {
        butterfly(4);
    }
}

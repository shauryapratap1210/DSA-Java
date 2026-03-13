public class diamond_pattern {
    public static void diamond_pattern(int TotalLines){
        for(int i=1;i<=TotalLines;i++){
            for(int spaces=1;spaces<=TotalLines-i;spaces++){
                System.out.print(" ");
            }
            for(int stars=1;stars<=(2*i)-1;stars++){
                System.out.print("*");
            }
            System.out.println();
        }
        //2nd half
        for(int i=TotalLines;i>=1;i--){
            for(int spaces=1;spaces<=TotalLines-i;spaces++){
                System.out.print(" ");
            }
            for(int stars=1;stars<=(2*i)-1;stars++){
                System.out.print("*");
            }
            System.out.println();

        }
    }

    public static void main(String[] args) {
        diamond_pattern(4);
    }
}

public class solid_rhombus {
    public static void solid_rhombus(int TotalLines){
        for(int i=1;i<=TotalLines;i++){
            for(int spaces=1;spaces<=TotalLines-i;spaces++){
                System.out.print(" ");
            }
            for(int stars=1;stars<=TotalLines;stars++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        solid_rhombus(5);
    }
}

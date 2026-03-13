public class hollow_rhombus {
    public static void hollow_rhombus(int TotalLines){
        for(int i=1;i<=TotalLines;i++){
            for(int spaces=1;spaces<=TotalLines-i;spaces++){
                System.out.print(" ");
            }
            for(int j=1;j<=TotalLines;j++){
                if(i==1||i==TotalLines||j==1||j==TotalLines){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        hollow_rhombus(5);
    }
}

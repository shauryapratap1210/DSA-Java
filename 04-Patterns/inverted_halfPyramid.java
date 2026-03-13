public class inverted_halfPyramid {
    public static void inverted_halfpyramid(int TotalLines){
        for(int i=1;i<=TotalLines;i++){
            for(int num=1;num<=TotalLines-i+1;num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        inverted_halfpyramid(5);
    }
}

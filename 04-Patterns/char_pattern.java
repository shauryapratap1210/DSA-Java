public class char_pattern {
    public static void main(String[] args) {
        int num=4;
        char ch='A';
        for(int line=1;line<=num;line++){
            for(int character=1;character<=line;character++){
                System.out.print(ch+" ");
                ch++;
            }
            System.out.println();
        }


    }
}


public class binary_to_dec {
    public static void Dec_convert(int binNum){
        int last_digit=0;
        int pow=0;
        int DecNum=0;
        while(binNum>0){
            last_digit=binNum%10;
            DecNum=DecNum+(last_digit*(int)Math.pow(2,pow));
            pow++;
            binNum/=10;
        }
        System.out.println(DecNum);
    }

    public static void main(String[] args) {
        Dec_convert(1001);
    }
}

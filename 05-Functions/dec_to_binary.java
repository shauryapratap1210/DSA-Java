public class dec_to_binary {
    public static void BinConvert(int DecNum){
        int pow=0;
        int BinNum=0;
        int rem=0;
        while(DecNum>0){
            rem=DecNum%2;
            BinNum=BinNum+(rem*(int)Math.pow(10,pow));
            DecNum/=2;
            pow++;

        }
        System.out.println(BinNum);
    }

    public static void main(String[] args) {
        BinConvert(9);
    }
}

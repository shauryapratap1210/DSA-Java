public class bankmain {
    public static void main(String args[]){
        BankAccount b=new BankAccount();
        System.out.println();
        BankAccount c=new BankAccount(102,34567);
//        System.out.println(c.balance);
        c.getAccountDetails();
    }
}

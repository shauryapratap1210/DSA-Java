public class BankAccount {
    private int AccountNum;
    private int balance;

    //Constructor
    public BankAccount(){
        System.out.println("Default constructor is called");
    }

    //Parameterized
    public BankAccount(int num,int bal){
        this.AccountNum=num;
        this.balance=bal;
    }

    public void getAccountDetails(){
        System.out.println("Account number is : "+this.AccountNum);
        System.out.println("Balaance is : "+balance);

    }

    public void setDetails(int num,int bal){
        this.AccountNum=num;
        this.balance=bal;

    }
}

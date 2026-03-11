public class if_else {
    public static void main(String[] args) {
        int age=22;
        if(age>=18){
            System.out.println("Eligible to Vote");
        }
        if(age>18 && age<23){
            System.out.println("Eligible to Vote but can't be a participant");
        }
        else{
            System.out.println("Sorry Not Eligible to Vote");
        }
    }
}

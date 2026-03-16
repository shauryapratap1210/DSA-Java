

public class Scopes {
    public static void main(String[] args) {
        // Here is error because its used before declartion System.out.println(i);
        int i=20;
        System.out.println(i); //here is used because after declaration
        for(int r=1;r<=5;r++){
            System.out.println(r);  //Block scope
        }
       // System.out.println(r);  // r cant be used because its out of for loop block
    }
}

public class StringBasics {
    public static void main(String[] args) {
        /*String Firstname="Shaurya";
        String Lastname= new String("Singh");
        System.out.println(Firstname+" "+Lastname);
        System.out.println("Length of firstname string is "+Firstname.length());

        System.out.println("Character at first index is "+ Firstname.charAt(6 ));*/

        //String Immutable

       /* String ch="Shaurya";
        ch="Naitik";
        // Not possible ch.charAt(0)=S;
        System.out.println(ch);*/


        //String Comparison
        String ch1="Shaurya";
        String ch2="shaurya";

       /* if(ch1==ch2){
            System.out.println("Correct");
        }

        else{
            System.out.println("Wrong");
        }*/

       /* if(ch1.equals(ch2)){
            System.out.println("Correct");
        }
        else{
            System.out.println("Wrong");
        }

        */
        if(ch1.equalsIgnoreCase(ch2)){
            System.out.println("True");
        }
        else{
            System.out.println("False");
        }



    }
}

public class StringMethods {
    public static void main(String[] args) {
       /* String st="Shaurya";
        String st2="   SHAURYA    ";
        String spaces="     ";
        String empty="";
        System.out.println(st.length());   //returns strings length
        System.out.println(st.charAt(0));  //returns character of string at a certain index
        System.out.println(st.equals(st2));    //compares strings but case sensitive
        System.out.println(st.equalsIgnoreCase(st2));     //compares strings regardless of character case
        System.out.println(spaces.isBlank());  //check if blank spaces in string or not
        System.out.println(empty.isEmpty());    //check if string is empty or not
        System.out.println(st2.trim());   //Remove spaces

        */

        /*String lower=" hey i am shaurya";
        String Upper="HEY I AM SHAURYA";
        System.out.println(lower.toUpperCase());   //convert to upper case
        System.out.println(Upper.toLowerCase());  //convert to lowercase


        System.out.println(lower.substring(2,7));  //returns substring from certain index to certain index
        System.out.println(lower.contains(Upper));  //checks if particular string part of other string or not

         */

        /*int num=5123;
        String st=String.valueOf(num);   //convert num to string
        System.out.println(num+1);   //Addition of number
        System.out.println(st+1);  //concatenation of string

         */

        /*String s="Love Babbar";
        System.out.println(s.startsWith("Lov")); //checks string starts with substring
        System.out.println(s.endsWith("bar")); //checks string ends with substring

         */

        /*String s="Shaurya";
        char ch[]=s.toCharArray();
        for(char c:ch){
            System.out.println("Value is : "+c);
        }

         */

        /*String s="Hi , I am, Shaurya ,Singh";
        String sh[]=s.split(",");
        for(String c:sh){
            System.out.println(c);


        }  Split method*/

        //Replace new string
        String name="Shaurya";
        name=name.replace('a','b');
        System.out.println(name);
            






    }
}

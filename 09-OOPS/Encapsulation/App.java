

public class App {
    public static void main(String[] args) {
       /* Student A=new Student();    //Default constructor created where no attribute is set

        //Setting Attributes
        A.id=1;
        A.Name="Shaurya";
        A.nos=3;
        A.age=20;
        System.out.println(A.Name);
        System.out.println(A.age);
        System.out.println(A.nos);
        System.out.println(A.id);

        A.sleep();
        A.study();
        A.bunk();*/

        //Parameterised Constructor
        Student B=new Student(2,19,"Naitik",3);
        /*
        System.out.println(B.id);
        System.out.println(B.age);
        System.out.println(B.Name);
        System.out.println(B.nos);

        B.sleep();
        B.study();
        B.bunk();

         */

        Student c=new Student(B);
        System.out.println(c.id);
        System.out.println(c.Name);
        System.out.println(c.nos);
        System.out.println(c.age);

        c.sleep();
        c.study();
        c.bunk();


    }
}

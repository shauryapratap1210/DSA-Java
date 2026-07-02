public class Student {
    //Attributes
    public int id;
    public int age;
    public String Name;
    public int nos;

    //Default Constructor
    public Student(){
        System.out.println("Constructor Called");
    }

    //PArameterized constructor
    public Student(int id,int age,String Name,int nos){
        System.out.println("Parameterized Constructor called");
        this.id=id;
        this.age=age;
        this.Name=Name;
        this.nos=nos;
    }


//Copy Constructor
public Student(Student srcobj){
    System.out.println("Copy Constructor called");
    this.id=srcobj.id;
    this.age=srcobj.age;
    this.Name=srcobj.Name;
    this.nos=srcobj.nos;
}



    //Methods
    public void study(){
        System.out.println(Name+"  Studying");
    }

    public void sleep(){
        System.out.println(Name+"   Sleeping");
    }

    public void bunk(){
        System.out.println(Name+"  Bunking");
    }
}

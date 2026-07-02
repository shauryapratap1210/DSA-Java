public class Person {

    private String name;
    private int age;
    private String country;

    //Constructor
    public Person(){
        System.out.println("Default constructor called");
        this.name="Default";
        this.age=18;
        this.country="No country yet";
    }

    //Parameterized Constructor
    public Person(String name,int age,String country){
        this.name=name;
        this.age=age;
        this.country=country;
    }

    //Getter && Setter
    public void getname(){
        System.out.println(this.name);
    }

    public void setname(String n){
        this.name=n;
    }

    public void getage(){
        System.out.println(this.age);
    }

    public void setage(int n){
        this.age=n;
    }

    public void getcountry(){
        System.out.println(this.country);
    }

    public void setcountry(String country){
        this.country=country;
    }

}

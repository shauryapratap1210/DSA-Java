public class PersonApp {
    public static void main(String[] args) {

        Person p=new Person();
        Person p2=new Person("Shaurya",19,"india");
        System.out.println("Name before setting is " );
        p.getname();
        p.setname("Naitik");
        System.out.println("Name after setting is ");
        p.getname();



    }
}

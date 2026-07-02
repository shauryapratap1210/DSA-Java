abstract class Bird{
    abstract void eat();

    abstract void fly();
}

class Sparrow extends Bird{
    void eat(){
        System.out.println("Bird Eating");
    }

    void fly(){
        System.out.println("Bird Flying");
    }



}


public class AbstractMain {
    public static void main(String args[]){
//        Bird b=new Bird();  cant be initiated as abstract class
        Bird b=new Sparrow();
        b.eat();
        b.fly();
    }

}

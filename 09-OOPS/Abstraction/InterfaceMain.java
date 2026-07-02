interface  Animal1{
    void sound();

    void move();


    default void sleep(){
        System.out.println("Sleeping");
    }

}


    //Interface


class Dog1 implements  Animal1{
    public void sound(){
        System.out.println("Dog makes sound");
    }

    public void move(){
        System.out.println("Dog moves");
    }
}

class Cat1 implements  Animal1{
    public void sound(){
        System.out.println("Cat makes sound");
    }

    public void move(){
        System.out.println("Cat moves");
    }
}










public class InterfaceMain {

    public static void main(String[] args) {
        Animal1 b=new Cat1();
        b.move();
        b.sleep();
    }
}

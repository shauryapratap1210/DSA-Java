

class MethodOverriding {
    public static void main(String[] args) {
        /*Function Overriding
        Shape s=new Shape();
        Circle c=new Circle();
        Rectangle t=new Rectangle();
        s.draw();
        c.draw();
        t.draw();

         */

        // Dynamic Method Dispatch
        Shape s=new Circle();     //Shape refers to circle
        doDrawingStuff(s);

        Shape s1=new Rectangle();    //Shape refers to rectangle
        doDrawingStuff(s1);

        Shape s2=new Shape() ;     //Shape refers to shape
        doDrawingStuff(s2);
    }

    public static void doDrawingStuff(Shape s){
        s.draw();
    }
}

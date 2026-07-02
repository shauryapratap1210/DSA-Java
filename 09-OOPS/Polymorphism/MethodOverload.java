class MethodOverloading{
    public static void main(String args[]){
        Calc c=new Calc();
        System.out.println(c.add(1,2));
        System.out.println(c.add(1,2,3));
        System.out.println(c.adddouble(1,3,9.02,7.08));

    }
}

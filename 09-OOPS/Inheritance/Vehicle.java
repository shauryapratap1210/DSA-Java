public class Vehicle {
    public String name;
    public String Model;
    public int number_of_tyres;

    //Default
    public Vehicle(){
        this.name=" ";
        this.Model="";
        this.number_of_tyres=-1;

    }

    //Constructor
    public Vehicle(String name,String Model,int number_of_tyres){
        this.name=name;
        this.Model=Model;
        this.number_of_tyres=number_of_tyres;
    }

    public void start_engine(){
        System.out.println("Engine is starting : "+name+" of "+Model);
    }

    public void stop_engine(){
        System.out.println("Engine is stopped : "+name+" of "+Model);

    }



}

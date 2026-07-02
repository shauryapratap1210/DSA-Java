public class Bike extends Vehicle{
    public String Handle;
    public String Suspensiontype;

    //Constructor
    public Bike(String name,String Model,int number_of_tyres,String handle,String suspensiontype){
        super(name,Model,number_of_tyres);
        this.Handle=handle;
        this.Suspensiontype=suspensiontype;
    }

    public void wheelie(){
        System.out.println("Motorcycle does wheelie");
    }



}

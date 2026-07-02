public class Car  extends Vehicle{
    public int number_of_doors;

    public String transmissiontype;

    //Constructor
    public Car(String name,String Model,int  number_of_tyres,int number_of_doors,String transmissiontype){
        super(name,Model,number_of_tyres);
        this.transmissiontype=transmissiontype;


    }
    public void StarAc(){
        System.out.println("Start the Ac"+name);
    }


}

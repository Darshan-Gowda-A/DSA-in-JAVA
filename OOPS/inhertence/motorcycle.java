package OOPS.inhertence;
public class motorcycle extends Vehical {
    public int milage;
    public String suspensiontype;

    motorcycle(String name,String model,int nooftyres, int milage,String suspensiontype){
        super(name,model,nooftyres);
        this.milage=milage;
        this.suspensiontype=suspensiontype;

        
    }
    public  void wheelie(){
        System.out.printf("motorcycle is doing a wheelie for %s : %s",name,model);
    }
}

